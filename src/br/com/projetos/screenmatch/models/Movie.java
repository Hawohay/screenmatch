package br.com.projetos.screenmatch.models;

import br.com.projetos.screenmatch.calculations.Classificavel;

public class Movie extends Title implements Classificavel {
    private String manager;

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public int getClassification() {
        return (int) averageRating() / 2;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
