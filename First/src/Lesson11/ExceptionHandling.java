package Lesson11;

public class ExceptionHandling {
    static void main() {
        System.out.println(divide(1,0));
    }

    public static int  divide(int a, int b){
        try{
            return a / b;
        } catch(ArithmeticException e){
            System.out.println(e);
            return -1;
        } finally{
            System.out.println("Terminated");
        }

    }
}
