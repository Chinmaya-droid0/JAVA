package Lesson9;

public class Exp {

    private String name;

    Exp(){
        System.out.println("Constructor is Called");
        name="Chinmaya";
    }

    Exp(String lang ){
        name = lang;
        System.out.println(name + " is a programming Language");
    }

    public static void main(String[] args) {
        Exp obj = new Exp();
        System.out.println("The name is: " + obj.name);

        Exp obj1 = new Exp("JAVA");
    }
}
