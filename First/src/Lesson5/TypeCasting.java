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

        char ch = 'a';

        in = ch;
        System.out.println(in);
        System.out.println(ch);
        System.out.println((int) ch);

        ch = 70;
        System.out.println(ch);
        System.out.println((int) 200);

        ch = (char)(ch+1);
        System.out.println(ch);

        ch = 'a' + 1;
        ch = (char) ('a' + ch);
        System.out.println(ch);

        System.out.println(10+ 20 + "Hello" + 10 + 20);
        System.out.println(2+ ' ' +5);
        System.out.println(2 + " " + 5);
        System.out.println("hello" + '\t' + "World");
        System.out.println(2 + '\t' + 3);

    }

}
