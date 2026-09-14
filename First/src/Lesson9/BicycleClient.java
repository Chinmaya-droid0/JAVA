package Lesson9;

public class BicycleClient {
    public static void main(String[] args) {
        Bicycle sportsBicycle = new Bicycle();

        System.out.println(sportsBicycle.gear);
        sportsBicycle.breaking();
    }
}
