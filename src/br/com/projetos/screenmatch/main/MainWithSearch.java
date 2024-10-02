package br.com.projetos.screenmatch.main;

import br.com.projetos.screenmatch.models.ConversionYearErrorException;
import br.com.projetos.screenmatch.models.Title;
import br.com.projetos.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner reading = new Scanner(System.in);
        String search = "";
        List<Title> titles = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!search.equalsIgnoreCase("sair")) {

            System.out.println("Digite um filme para busca");
            search = reading.nextLine();

            if(search.equalsIgnoreCase("sair")){
                break;
            }

            String address = "http://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=3cf984d7";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(address))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(myTitleOmdb);

                //try {
                Title myTitle = new Title(myTitleOmdb);
                System.out.println("Converted title");
                System.out.println(myTitle);

//                FileWriter writer = new FileWriter("movie.txt");
//                writer.write(myTitle.toString());
//                writer.close();

                titles.add(myTitle);

            } catch (NumberFormatException e) {
                System.out.println("Houve um erro");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro no argumento na busca");
            } catch (ConversionYearErrorException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titles);

        FileWriter writer = new FileWriter("movies.json");
        writer.write(gson.toJson(titles));
        writer.close();
        System.out.println("Finalizado!");
    }
}
