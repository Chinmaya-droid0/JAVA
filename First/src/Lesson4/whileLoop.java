package Lesson4;

public class whileLoop {
    public static void main(String[] args) {
        int x =10;

        while (x <= 20){
            System.out.print("Value of x: "+ x);
            x++;
            System.out.print("\n");
        }

        int [] numbers = {10,20,30,40,50};
        int index = 0;

        while(index < 3){
            System.out.print("Value of item: "+ numbers[index]);
            index++;
            System.out.print("\n");
        }

    }
}
