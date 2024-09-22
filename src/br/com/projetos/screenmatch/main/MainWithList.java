package br.com.projetos.screenmatch.main;
import br.com.projetos.screenmatch.models.Movie;
import br.com.projetos.screenmatch.models.Title;
import br.com.projetos.screenmatch.models.Serie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWithList {
    public static void main(String[] args) {

        ArrayList<Title> listWatched = new ArrayList<>();

        Movie myMovie = new Movie("The Godfather", 1972);
        myMovie.toAssess(9);
        Movie otherMovie = new Movie("The Godfather II", 1981);
        otherMovie.toAssess(8);
        Movie movieTerror = new Movie("Exorcista", 1992);
        movieTerror.toAssess(6);
        Serie lost = new Serie("Lost", 2000);

        listWatched.add(myMovie);
        listWatched.add(otherMovie);
        listWatched.add(movieTerror);
        listWatched.add(lost);

        for (Title item : listWatched) {
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getClassification() > 2) {
                System.out.println("Classification: " + movie.getClassification());
            }
        }

        ArrayList<String> searchForActor = new ArrayList<>();
        searchForActor.add("Adam Sandler");
        searchForActor.add("Paulo");
        searchForActor.add("Luíza");
        searchForActor.add("Bruna");
        searchForActor.add("Aline");

        System.out.println("Lista desordenada: ");
        System.out.println(searchForActor);
        System.out.println();
        Collections.sort(searchForActor);
        System.out.println("Lista ordenada: ");
        System.out.println(searchForActor);
        System.out.println();
        Collections.sort(listWatched);
        System.out.println("Lista de títulos ordenados por ordem alfabética: " + listWatched);
        System.out.println();

        listWatched.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println("Lista de títulos ordenados por ano de lançamento: " + listWatched);
    }
}












