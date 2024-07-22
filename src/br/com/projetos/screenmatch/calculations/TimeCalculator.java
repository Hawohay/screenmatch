package br.com.projetos.screenmatch.calculations;

import br.com.projetos.screenmatch.models.Movie;
import br.com.projetos.screenmatch.models.Serie;
import br.com.projetos.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime = 0;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void addTimeDuration(Movie movie){
//        totalTime += movie.getDurationInMinutes();
//    }
//
//    public void addTimeDuration(Serie serie) {
//        totalTime += serie.getDurationInMinutes();
//    }

    public void addTimeDuration(Title title){
        System.out.println(title);
        this.totalTime += title.getDurationInMinutes();
    }

}
