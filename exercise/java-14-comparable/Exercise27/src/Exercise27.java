import java.util.*;

/**
 * Execrise:
 * Try to implement Comparable interface, to make the list sorted by Collections.sort in decending order
 * And think about how Collection achieve this ordering function
 */
/**
 * Expected Output:
 * Movies after sorting:
 * Force Awakens 8.3 2015
 * Return of the Jedi 8.4 1983
 * Star Wars 8.7 1977
 */
class Movies implements Comparable<Movies> {
    private double rating;
    private String name;
    private int year;

    // Constructor
    public Movies(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movies movie){
    if (movie.getYear() > this.year)
    return 1;
    else return -1;
    }
}

// Driver class
class Exercise27 {
    public static void main(String[] args) {
        ArrayList<Movies> list = new ArrayList<Movies>();
        list.add(new Movies("Star Wars", 8.7, 1977));
        list.add(new Movies("Force Awakens", 8.3, 2015));
        list.add(new Movies("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Movies after sorting: ");
        for (Movies movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }
}