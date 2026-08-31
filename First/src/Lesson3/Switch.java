package Lesson3;

public class Switch {
    public static void main(String[] args) {
        int num = 48;
        String size ;

        switch(num) {
            case 29:
                size="small";
                break;
            case 42:
                size="Medium";
                break;
            case 48:
                size = "Large";
                break;
            case 50:
                size="Extra Large";
                break;
            default:
                size="Unknown";
                break;
        }
        System.out.println("Size: "+ size);
    }
}
