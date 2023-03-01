package CollectionsExercises;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("green");
        colors.add("yellow");
        colors.add("blue");
        colors.add("purple");
        colors.add("orange");

        for(String color : colors) {
            System.out.println(color);
        }

    }
}
