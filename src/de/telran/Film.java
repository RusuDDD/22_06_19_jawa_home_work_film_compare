package de.telran;

public class Film {
    private String name;
    private String genre;
    private double rating;
    private int years;

    public  Film(String name, String genre, double rating, int years) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public int getYears() {
        return years;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", years=" + years +
                '}' + System.lineSeparator();
    }
}
