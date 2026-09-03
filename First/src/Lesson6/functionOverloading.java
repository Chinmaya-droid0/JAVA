package Lesson6;

public class functionOverloading {
    private static Object result    ;

    // In java, two or more methods may have the same name if they differ in parameters
    // (different no of parameters, different types of parameters, or both).
    // These methods are called overloaded methods and this feature is called method overloading.

    // Mainly the terms function is called method in java

    // void fun() {...}
    // void fun(int a) {...}
    // float func (double a) {...}
    // float func (int a , float b) {...}

    // Method overloading is not associated with return types
    // Overloading methods may have the same or different return types, but they must differ in parameters

    public static void main(String[] args) {

       int res = addNumbers(5,4);
        System.out.println(res);
        int i = addNumbers();
        System.out.println(i);

        for(int j=1; j<=5; j++){
            int result = getSquare(j);
            System.out.println("Square of " + j + " is: " + result);
        }


    }
    public static int addNumbers(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static int addNumbers(){
        int a =5;
        int b = 4;

        int sum = a+b;

        return sum;
    }

    public static int getSquare(int x){
        return x * x;
    }
    }

