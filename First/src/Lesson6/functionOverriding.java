package Lesson6;

public class functionOverriding {
    private static Object result    ;

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

