package Lesson7;

public class arraySwap {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        int[] other = {100,200,300};

        System.out.println(arr[0] + "," + other[0]);
        swap(arr,other);
        System.out.println(arr[0]+ "," + other[0]);
    }

    public static void swap(int[] one, int[] two){
        int[] temp = one;
        one = two;
        two = temp;
    }
    // Only in Arrays and Objects the values are passed by reference.
}
