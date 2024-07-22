package br.com.projetos.screenmatch.calculations;

public class RecommendationFilter {
    
    public void filter(Classificacao classificacao){
        if (classificacao.getClassificacao() >= 4) {
            System.out.println("Preferidos!");
        } else if (classificacao.getClassificacao() >=2){
            System.out.println("Bem avaliado!");
        } else {
            System.out.println("Assista agora!");
        }
    }
}
