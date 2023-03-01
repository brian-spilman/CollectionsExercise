package CollectionsExercises.PriorityQueueExercises;

public class MusicArtist implements Comparable<MusicArtist> {
    private String name;
    private String genre;

    public MusicArtist(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "MusicArtist{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    public int compareTo(MusicArtist other) {

        int result;
        result = this.genre.compareTo(other.getGenre());

        if(result != 0) {
            return result;
        }
        else {
            return this.name.compareTo(other.getName());
        }

    }
}
