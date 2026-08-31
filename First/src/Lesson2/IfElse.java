package Lesson2;

public class IfElse {
    public static void main(String[] args) {
        boolean prime = true;
        if(!prime){
            System.out.println("Welcome");
        } else {
            System.out.println("Chal nikal lawde");
        }

        boolean primesub = false;
        boolean acorn =false;
        boolean amc = true;

        if(primesub){
             if(acorn || amc){
                 System.out.println("Yes! you can enjoy it");
             }else{
                 System.out.println("You have to buy either the acorn or amc");
             }
        } else{
            System.out.println("Pehli fursat mein nikal!");
        }
    }
}
