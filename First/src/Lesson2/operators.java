package Lesson2;

public class operators {
    public static void main(String[] args) {
        //Arithmetic operators

        int a =12, b =5;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //Assignment operators

        int age;
        age =5;

        int val =  age;
        val+=age;  //Similarly -=, *=, /=, %=
        System.out.println(val);

        //Relational operators (Mostly return in True or False)

          int c =8, t =20;
        System.out.println(c + " " + t);

        System.out.println(c == t);
        System.out.println(c != t);
        // Similarly >, <, >=, <=

        // Logical operators (To check whether an expression is true or false)
         //1. && (Logical AND)

        System.out.println((5>3) && (7>2));
        System.out.println((7<2) && (5>1));

        //2. || (Logical OR)

        System.out.println((5>3) || (7>2));
        System.out.println((7<2)|| (5>1));
        System.out.println((7<2) && (5<1));

        //3. ! (Logical NOT)

        System.out.println(!(5 == 3));
        System.out.println(!(5 != 3));

       //Unary operators (++, --)

        int d =5;
        System.out.println(++d);
        System.out.println(d++);
        System.out.println(--d);
        System.out.println(d--);
    }

}
