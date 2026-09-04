package Lesson7;

public class minMaxValue {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        System.out.print("The minimum Element is: ");
        minValue(arr);
        System.out.print("The Maximum Element is: ");
        maxValue(arr);
    }

    public static void minValue(int[] arr) {
       // int min = Integer.MAX_VALUE;
         int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void maxValue(int[] arr){
       // int max = Integer.MIN_VALUE;
        int n = arr.length;
         int max = arr[n-1];

        for(int i=0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
