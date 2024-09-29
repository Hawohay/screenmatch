package br.com.projetos.screenmatch.models;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {

    private String name;

    private int releaseYear;
    private int durationInMinutes;
    private boolean includedInThePlan;
    private double addReviews;
    private int totalReviews;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();

        if(myTitleOmdb.year().length() > 4){
            throw new ConversionYearErrorException("Não consegui converter o ano de lançamento " +
                    "porque tem mais de 4 caracteres.");
        }
        this.releaseYear = Integer.valueOf(myTitleOmdb.year());
        this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0, 3));
    }

    public void displayDatasheet() {
        System.out.println("Film's name: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Duration in minutes: " + durationInMinutes);
        System.out.println("Include in plan: " + includedInThePlan);
    }

    public void toAssess(double grade) {
        addReviews += grade;
        totalReviews++;
    }

    public double averageRating() {
        return addReviews / totalReviews;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getTotalReviews() {
        return totalReviews;
    }


    @Override
    public int compareTo(Title otherTitulo) {
        return this.getName().compareTo(otherTitulo.getName());
    }

    @Override
    public String toString() {
        return "Title{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear + '\'' +
                ", durationsInMinutes=" + durationInMinutes +
                '}';
    }
}
