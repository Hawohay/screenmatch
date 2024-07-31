package br.com.projetos.screenmatch.principal;
import br.com.projetos.screenmatch.models.Movie;
import br.com.projetos.screenmatch.models.Title;
import br.com.projetos.screenmatch.models.Serie;
import java.util.ArrayList;

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
    }
}
