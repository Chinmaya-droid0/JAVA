package Lesson9;

public class Test {

    private  String name;

    Test() {
        System.out.println("Constructor is Called");
        name = "Chinmaya";
    }


    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println("The name is " + obj.name);
    }
}
