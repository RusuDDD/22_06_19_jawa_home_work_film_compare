package de.telran;

import java.util.Comparator;

public class CompareByYear implements Comparator<Film> {

    @Override
    public int compare(Film o1, Film o2) {
        return Integer.compare(o1.getYears(), o2.getYears());
    }
}
