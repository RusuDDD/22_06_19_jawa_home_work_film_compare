package de.telran;

import java.util.Comparator;

public class CompareByName implements Comparator<Film> {


    @Override
    public int compare(Film o1, Film o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
