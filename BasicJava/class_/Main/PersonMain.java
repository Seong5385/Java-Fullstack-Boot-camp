package class_.Main;

import class_.classes.DeptPerson;

public class PersonMain {
    public static void main(String[] args) {
        DeptPerson d1 = new DeptPerson("sibal", 25, "1234 - 4567", "sibal", "programming");

        System.out.println(d1.getInfo());
        d1.doWork();

    }
}
