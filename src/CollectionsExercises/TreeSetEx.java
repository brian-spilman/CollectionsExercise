package CollectionsExercises;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

    public static void main(String[] args) {

        Set<Integer> nums = new TreeSet<>();

        for(int i = 9; i > -1; i--){
            nums.add(i);
        }

        for(Integer num : nums) {
            if(num < 7) {
                System.out.println(num);
            }
        }

    }

}
