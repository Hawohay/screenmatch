package br.com.projetos.screenmatch.models;

import br.com.projetos.screenmatch.calculations.Classificacao;

public class Movie extends Title implements Classificacao {
    private  String manager;

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public int getClassificacao() {
        return (int) averageRating() / 2;
    }
}
