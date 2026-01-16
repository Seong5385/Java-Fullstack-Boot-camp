package class_.classes;

public class Person {

    // 1. 멤버 변수
    public String name;
    public int age;
    public String phone;
    public String address;

    // 2. 생성자
    public Person() { // 기본 생성자
        // super(); - 생략
    }

    public Person(String name, int age, String phone, String address) { // 멤버변수 전체에 대한 생성
        this.name = name; // this 자기 자신이고, name이란 멤버변수 불러오고 있음.
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    // this() 사용한 기본 설정
    public Person(String name, int age) {
        this(name, age, "010-0000-0000", "대한 민국 어디~~~");
    }

    public Person(String name, int age, String phone) {
        // this(name, age, phone, "대한 민국 어디~~~ ");
        this(name, age);
        this.phone = "010-1111-111";
    }

    // 3. 메서드
    public String getInfo() {
        String text = String.format("%s 님 환영합니다. 당신의 나이는 %d살 입니다.\n", this.name, this.age);
        // String.format() - System.out.printf의 포멧스티링을 이용한 문자열 출력와 같은 형식으로 문자열을 생성
        return text;
    }

    // 클래스 내에 있는 멤버변수 값을 불러오거나 수정하는 메서드
    // getter, setter 메서드 라고 합니다.
    // getter -> 클래스 내에서 멤버변수에 대한 값을 메서드를 통해서 전달.
    // setter -> 클래스 내에 멤버변수에 대한 값을 수정할 때 메서드를 통해서 처리.
    // why? 메서드를 사용할까? 1) 보안, 2) 검증
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(String name) {
        if (this.name.equals(name)) {
            return age;
        } else
            return 0;

    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
        else
            this.age = 0;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void doWork() {
        System.out.println("사람이 일을 합니다.");
    }

    @Override
    public String toString() { // toString() 메서드는 객체의 문자열 출력시 사용됨.
        return "Person [name=" + name + ", age=" + age + ", phone=" + phone + ", address=" + address + "]";
    }

}