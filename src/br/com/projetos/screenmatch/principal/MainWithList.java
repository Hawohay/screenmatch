package br.com.projetos.screenmatch.principal;
import br.com.projetos.screenmatch.models.Movie;
import br.com.projetos.screenmatch.models.Serie;
import java.util.ArrayList;

public class MainWithList {
    public static void main(String[] args) {

        ArrayList<Movie> listWatched = new ArrayList<>();

        Movie myMovie = new Movie("The Godfather", 1972);
        Movie otherMovie = new Movie("The Godfather II", 1981);
        Movie movieTerror = new Movie("Exorcista", 1992);
        Serie lost = new Serie("Lost", 2000);

        listWatched.add(myMovie);
        listWatched.add(otherMovie);
        listWatched.add(movieTerror);


    }
}
