package MyLabPractice;

public class Exp3 {
    int rollNo;
    String name;

    void insertData(int r, String n) {
        rollNo = r;
        name = n;
    }

    void displayInfo() {
        System.out.println(rollNo + " " + name);

    }
}

class Students{
    public static void main(String[] args) {
        Exp3 s1 = new Exp3();
        Exp3 s2 = new Exp3();

        s1.insertData(331, "KK");
        s2.insertData(332, "Arijit");
        s1.displayInfo();
        s2.displayInfo();
    }
}
