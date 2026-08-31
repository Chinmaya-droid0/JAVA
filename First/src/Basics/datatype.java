package Basics;

public class datatype {
    public static void main(String[] args) {
        boolean flag = false;
        System.out.println(flag);

        byte range = 127; //-128 to 127
        System.out.println(range);

        short temp = -200; //-32768 to 32767
        System.out.println(temp);

        long ranges = -4234334443L;
        System.out.println(ranges);

        float value = 24.2F;
        System.out.println(value);

        // similarly for int -2^31 to 2^31 -1
        // For long -2^63 to 2^63-1

        /*char
         * Its a 16 bit unicode character
         * The minimum value of char data type is '\u0000' and maximum value is  '\uffff'
        */

        char letter = '\u0024';
        System.out.println(letter);

        char khat ='A';
        System.out.println(khat);
    }

}
