package MyLabPractice;

 class Employee {
    int id;
    String name;
    float salary;

    void insert(int i, String n, float s){
        id = i;
        name = n;
         salary  = s;
    }

    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}

public class Emp{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.insert(331, "Kalia" , 45000);
        e2.insert(332,"Tapu", 25000);
        e3.insert(333, "Tapan", 55000);
        e1.display();
        e2.display();
        e3.display();

    }
}
