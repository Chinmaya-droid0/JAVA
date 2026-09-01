package Lesson5;

public class TypeCasting {

    // double -> float -> long -> int -> short -> byte (Explicit TypeCasting)

    // byte -> short -> int -> long -> float -> double (Implicit TypeCasting)

    public static void main(String[] args) {

        byte by = 10;
        short sh = 10;
        int in = 10;
        long lo = 10;

        // Implicit way

        sh = by;
        in = sh;
        lo = in;
        in = by;
        lo = sh;
        lo = by;

        // Explicit Way

        byte b = (byte) 130;
        System.out.println(b); // (-126), Range : -128 to 127 for Byte
    }

}
