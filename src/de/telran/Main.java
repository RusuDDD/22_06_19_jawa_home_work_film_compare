package de.telran;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Создать класс Film и полями класса: название, жанр, рейтинг, год ; Создать список фильмов.
//       Программа должна спрашивать какая сортировка нужна пользователю
//       (по названию, по рейтингу, по жанру или году)
//        и выводить отсортированный список на экран.

        Film film1 = new Film("Abcabc", "drama", 6.9, 1994);
        Film film2 = new Film("bbbbb", "crime", 9.8, 1972);
        Film film3 = new Film("iiiii", "action", 4.7, 2008);
        Film film4 = new Film("kkkkk", "action", 9.6, 2003);
        Film film5 = new Film("dddd", "drama", 8.5, 1993);
        Film film6 = new Film("xxxx", "crime", 9.4, 1974);
        Film film7 = new Film("yyyyy", "crime", 6.3, 1957);
        Film film8 = new Film("fffff", "crime", 3.2, 1994);
        Film film9 = new Film("lllll", "action", 9.9, 2010);
        Film film10 = new Film("bbbb part2", "adventure", 7.8, 2002);

        List<Film> filmList = new ArrayList<>();
        filmList.add(film1);
        filmList.add(film2);
        filmList.add(film3);
        filmList.add(film4);
        filmList.add(film5);
        filmList.add(film6);
        filmList.add(film7);
        filmList.add(film8);
        filmList.add(film9);
        filmList.add(film10);

        ChooseTypeSort typeSort = new ChooseTypeSort();
        typeSort.getInput(filmList);
    }

}
