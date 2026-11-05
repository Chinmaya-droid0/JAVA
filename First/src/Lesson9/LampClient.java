package Lesson9;

public class LampClient {
    static void main() {
        Lamp BulbLamp = new Lamp();
        Lamp HalogenLamp = new Lamp();

        BulbLamp.turnOn();
        HalogenLamp.turnOff();
    }

}
