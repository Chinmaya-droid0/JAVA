package MyLabPractice;

public class methodOverload {
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }

    public double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        methodOverload mo = new methodOverload();

        System.out.println("Sum of 2 and 3 is: "+ mo.add(2,3));
        System.out.println("Sum of 3,5 and 7 is: "+ mo.add(3,5,7));
        System.out.println("Sum of 1.5 and 2.5 is: "+ mo.add(1.5,2.5));
    }
}
