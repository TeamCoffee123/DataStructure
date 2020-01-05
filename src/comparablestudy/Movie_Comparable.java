package comparablestudy;

public class Movie_Comparable implements Comparable<Movie_Comparable> {
    private double rating;
    private String name;
    private  int year;

    public int compareTo(Movie_Comparable m){
        return this.year -m.year;
    }

    public Movie_Comparable(String nm, double rt, int yr){
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    public double getRating(){
        return rating;
    }
    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }
}


