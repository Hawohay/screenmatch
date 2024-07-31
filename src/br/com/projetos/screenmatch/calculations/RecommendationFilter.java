package br.com.projetos.screenmatch.calculations;

public class RecommendationFilter {
    
    public void toFilter(Classificavel classificavel){
        if (classificavel.getClassification() >= 4) {
            System.out.println("Preferidos!");
        } else if (classificavel.getClassification() >=2){
            System.out.println("Bem avaliado!");
        } else {
            System.out.println("Assista agora!");
        }
    }
}
