package CollectionsExercises.PriorityQueueExercises;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExercise {

    public static void main(String[] args) {

        Queue<String> colors = new PriorityQueue<>();

        colors.add("red");
        colors.add("green");
        colors.add("yellow");
        colors.add("blue");
        colors.add("purple");
        colors.add("orange");

        while(!colors.isEmpty()){
            System.out.println(colors.poll());
        }

        System.out.println();

        Queue<MusicArtist> artists = new PriorityQueue<>();

        artists.add(new MusicArtist("MARAUDA", "Electronic"));
        artists.add(new MusicArtist("Johnny Cash", "Country"));
        artists.add(new MusicArtist("Yheti", "Electronic"));
        artists.add(new MusicArtist("Hank Williams", "Country"));
        artists.add(new MusicArtist("HOL!", "Electronic"));
        artists.add(new MusicArtist("MF DOOM", "Rap"));
        artists.add(new MusicArtist("Drake", "Pop"));
        artists.add(new MusicArtist("Bad Bunny", "Pop"));

        // sorted by genre, then by artist
        while(!artists.isEmpty()) {
            System.out.println(artists.poll());
        }

    }

}
