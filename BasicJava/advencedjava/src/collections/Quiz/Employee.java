package collections.quiz;

import java.util.*;

public abstract class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public abstract void salary();
}

class RegularEmployee extends Employee {
    private int bonus;

    public RegularEmployee(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void salary() {
        System.out.println(getName() + "의 급여는 " + (getSalary() + bonus));
    }
}

class ContractEmployee extends Employee {
    private int time;

    public ContractEmployee(String name, int salary, int time) {
        super(name, salary);
        this.time = time;
    }

    @Override
    public void salary() {
        System.out.println(getName() + "의 급여는 " + (getSalary() * time));
    }
}

class Main {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();

        employee.add(new RegularEmployee("김철수", 3000, 500));
        employee.add(new ContractEmployee("이영희", 20, 160));

        employee.forEach(e -> e.salary());
    }
}
