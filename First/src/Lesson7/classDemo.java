package Lesson7;

 class Student {
    String name;
    int age;
    int id;

    void studying(){
        System.out.println("Student is Studying");
    }

    void playing(){
        System.out.println("Student is Playing");
    }
}

public class classDemo {
    public static void main(String[] args) {

       Student st = new Student();
       st.studying();
       st.playing();
    }
}
