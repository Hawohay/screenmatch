package br.com.projetos.screenmatch.calculations;

public class RecommendationFilter {
    
    public void toFilter(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Preferidos!");
        } else if (classificavel.getClassificacao() >=2){
            System.out.println("Bem avaliado!");
        } else {
            System.out.println("Assista agora!");
        }
    }
}
