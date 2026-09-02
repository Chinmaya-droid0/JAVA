package Lesson6;

public class functionDemo {
    public static void main(String[] args) {

        System.out.println("Let's get Started");
        sayHello();
        System.out.println("See you soon!");
        addNumbers(25, 10);
        addNumbers(2,3);

        int res = addThree(2,4,5);
        System.out.println(res);
    }

    public static void sayHello() {
        System.out.println("Hello to You");
        System.out.println("Hope you are having a good Day!");

    }

    public static void addNumbers(int val1, int val2) {
        int sum = val1 + val2 ;
        System.out.println(sum);


    }

    public static int addThree(int a, int b, int c) {
        int sum = a+b+c;
        return sum;  // A function returns mostly a single value

    }
}
