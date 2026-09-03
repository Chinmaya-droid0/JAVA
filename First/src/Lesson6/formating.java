package Lesson6;

public class formating {
    public static void main(String[] args) {

        System.out.println(formatNumber(500));
        System.out.println(formatNumber(89.9934));
        System.out.println(formatNumber("550"));
        swap(10,20);
    }
    public static String formatNumber(int value){
        return String.format("%d", value);
    }

    public static String formatNumber(double value){
        return String.format("%.3f", value);
    }

    public static String formatNumber(String value){
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void swap(int one, int two){
        System.out.println(one + "," + two);
         one = one + two;
         two = one - two;
         one = one - two;
        System.out.println(one + "," + two);

    }

    // There is no option of pass by reference in JAVA mainly as C++

}
