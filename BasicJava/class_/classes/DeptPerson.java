package class_.classes;

public class DeptPerson extends Person {
    private String dept;

    public DeptPerson(String n, int a, String p, String add, String d) {
        super(n, a, p, add);
        this.dept = d;
    }

    @Override
    public String getInfo() {
        return String.format("%s 님 환영합니다. 당신의 나이는 %d살 입니다.\n%s부서에 소속 되있습니다.\n", this.name, this.age, this.dept);
    }

    @Override
    public void doWork() {
        System.out.printf("%s님은 %s부서에 소속되어 일을 합니다.", this.name, this.dept);
    }

}
