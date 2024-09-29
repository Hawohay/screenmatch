package br.com.projetos.screenmatch.models;

public class ConversionYearErrorException extends RuntimeException {
    private String menssage;

    public ConversionYearErrorException(String menssage) {
        this.menssage = menssage;
    }

    @Override
    public String getMessage() {
        return this.menssage;
    }
}
