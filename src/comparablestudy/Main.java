package comparablestudy;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Movie_Comparable> list = new ArrayList<Movie_Comparable>();
        list.add(new Movie_Comparable("Force Awakens", 8.3, 2015));
        list.add(new Movie_Comparable("Star Wars", 8.7, 1977));
        list.add(new Movie_Comparable("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie_Comparable("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Sorted by year ");
        for(Movie_Comparable movie_comparable : list){
            System.out.println(movie_comparable.getYear()+" "+movie_comparable.getRating()+" "+movie_comparable.getName()+" ");
        }

        System.out.println();
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list,ratingCompare);
        for(Movie_Comparable movie_comparable: list){
            System.out.println(movie_comparable.getRating()+" "+movie_comparable.getName()+" "+movie_comparable.getYear());
        }
    }

}
