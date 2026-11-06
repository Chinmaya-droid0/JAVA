package Lesson11;

public class Complex {

    private int a,b;

    private Complex(int i, int j){
        this.a = i;
        this.b = j;
    }

    private Complex(int i){
        this(i,i);
    }

    private Complex(){
        this(0);
    }

    @Override
    public String toString(){
        return this.a + " + " + this.b;
    }

    static void main() {
        Complex c1 = new Complex(2,3);
        System.out.println(c1);

        Complex c2 = new Complex();
        System.out.println(c2);

        Complex c3 = new Complex(3);
        System.out.println(c3);

    }
}
