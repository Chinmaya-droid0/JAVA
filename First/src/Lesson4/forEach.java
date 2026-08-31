package Lesson4;

import java.util.Arrays;
import java.util.List;

public class forEach {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50);
        List<String> names = Arrays.asList("James", "Larry", "Tom", "Lacy");

        for(Integer x : numbers){
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println();

        for(String name : names){
            System.out.print(name);
            System.out.print(",");
        }
    }
}
