package Lesson9;

public class Main2 {

    String lang;

    Main2(){
        lang = "Java";
    }

    Main2(String language){
        lang = language;
    }

    public void getName() {
        System.out.println("Langauge is "+ lang);
    }

}
