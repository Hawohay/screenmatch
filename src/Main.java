import br.com.projetos.screenmatch.calculations.RecommendationFilter;
import br.com.projetos.screenmatch.calculations.TimeCalculator;
import br.com.projetos.screenmatch.models.Episode;
import br.com.projetos.screenmatch.models.Movie;
import br.com.projetos.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Movie myMovie = new Movie("The Godfather", 1972);
        myMovie.setDurationInMinutes(180);
        myMovie.setIncludedInThePlan(true);

        myMovie.displayDatasheet();
        myMovie.toAssess(8);
        myMovie.toAssess(7);
        myMovie.toAssess(9);
        System.out.println("Total de avaliações: " + myMovie.getTotalReviews());
        System.out.println(myMovie.averageRating());


        Serie lost = new Serie("Lost", 2000);
        lost.displayDatasheet();
        lost.setSeason(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Title duration: " + lost.getDurationInMinutes());

        Movie otherMovie = new Movie("The Godfather II", 1981);
        otherMovie.setDurationInMinutes(360);

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.addTimeDuration(myMovie);
        timeCalculator.addTimeDuration(otherMovie);
        timeCalculator.addTimeDuration(lost);
        System.out.println(timeCalculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.toFilter(myMovie);

        System.out.println();

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalViewers(300);
        filter.toFilter(episode);

        Movie movieTerror = new Movie("Exorcista", 1992);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(myMovie);
        movieList.add(otherMovie);
        movieList.add(movieTerror);
        System.out.println("Tamanho da lista: " + movieList.size());
        System.out.println("First movie: " + movieList.get(0).getName());
        System.out.println(movieList);
        System.out.println();
        System.out.println("toString of movie: " + movieList.get(0).toString());

    }
}