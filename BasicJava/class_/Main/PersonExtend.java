package class_.Main;

import class_.quiz.classes.Person;

public class PersonExtend extends Person {

    public PersonExtend(String na, int ag) {
        super(na, ag);
    }

    @Override
    public String getName() {
        return super.toString();
    }

}

class Main {
    public static void main(String[] args) {
        PersonExtend p = new PersonExtend("sibal", 10);
        System.out.println(p.getName());
    }
}
