package de.telran;

import javax.xml.stream.events.Comment;
import java.util.Comparator;

public class CompareByRating implements Comparator<Film> {


    @Override
    public int compare(Film o1, Film o2) {
        return Double.compare(o1.getRating(), o2.getRating());
    }
}
