package de.telran;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ChooseTypeSort {

    public void getInput(List<Film> filmList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which one of the sorting methods you would like to " +
                "use 1 (byRating); 2 (byGenre); 3 (byName); 4 (byYear) ");
        switch (scanner.nextInt()) {
            case 1 ->{
                Comparator<Film> byRating = new CompareByRating();
                filmList.sort(byRating);
                System.out.println(filmList);

            }
            case  2 ->{
                Comparator<Film> byGenre = new CompareByGenre();
                filmList.sort(byGenre);
                System.out.println(filmList);

            }
            case 3->{
                Comparator<Film> byName = new CompareByName();
                filmList.sort(byName);
                System.out.println(filmList);

            }
            case 4->{
                Comparator<Film> byYear = new CompareByYear();
                filmList.sort(byYear);
                System.out.println(filmList);

            }
            default -> System.out.println("Game over");
        }
    }
}
