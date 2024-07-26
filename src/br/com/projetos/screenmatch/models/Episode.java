package br.com.projetos.screenmatch.models;

import br.com.projetos.screenmatch.calculations.Classificavel;

public class Episode implements Classificavel {
    private int number;
    private String name;
    private Serie serie;
    private int totalViewers;

    public int getTotalViewers() {
        return totalViewers;
    }

    public void setTotalViewers(int totalViewers) {
        this.totalViewers = totalViewers;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalViewers > 100) {
            return 4;
        } else {
            return 2;
        }

    }
}
