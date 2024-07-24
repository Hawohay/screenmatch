import br.com.projetos.screenmatch.calculations.RecommendationFilter;
import br.com.projetos.screenmatch.calculations.TimeCalculator;
import br.com.projetos.screenmatch.models.Episode;
import br.com.projetos.screenmatch.models.Movie;
import br.com.projetos.screenmatch.models.Serie;

public class Main {

    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setName("The Godfather");
        myMovie.setReleaseYear(1972);
        myMovie.setDurationInMinutes(180);
        myMovie.setIncludedInThePlan(true);

        myMovie.displayDatasheet();
        myMovie.toAssess(8);
        myMovie.toAssess(7);
        myMovie.toAssess(9);
        System.out.println("Total de avaliações teste: " + myMovie.getTotalReviews());
        System.out.println(myMovie.averageRating());


        Serie lost = new Serie();

        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.displayDatasheet();
        lost.setSeason(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Title duration: " + lost.getDurationInMinutes());

        Movie otherMovie = new Movie();

        otherMovie.setName("The Godfather II");
        otherMovie.setReleaseYear(1981);
        otherMovie.setDurationInMinutes(360);

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.addTimeDuration(myMovie);
        timeCalculator.addTimeDuration(otherMovie);
        timeCalculator.addTimeDuration(lost);
        System.out.println(timeCalculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalViewers(300);
        filter.filter(episode);

    }
}