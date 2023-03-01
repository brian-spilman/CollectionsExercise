package CollectionsExercises;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

    public static void main(String[] args) {

        // had to change from List to LinkedList in order to get descendingIterator()
        LinkedList<String> movies = new LinkedList<>();

        movies.add("Top Gun: Maverick");
        movies.add("Spider-Man: No Way Home");
        movies.add("Jai Bhim");
        movies.add("Hamilton");
        movies.add("The Father");

        Iterator<String> iterator = movies.descendingIterator();

        while(iterator.hasNext()) {

            String movie = iterator.next();
            System.out.println(movie);

        }

    }
}
