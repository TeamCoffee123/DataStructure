package comparablestudy;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie_Comparable> {
    public int compare(Movie_Comparable m1, Movie_Comparable m2){
        if(m1.getRating() < m2.getRating()){
            return -1;
        }
        if(m1.getRating() > m2.getRating()){
            return 1;
        }
        else
            return 0;
    }
}
