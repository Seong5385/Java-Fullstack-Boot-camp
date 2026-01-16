package class_.classes;

public class ClassEx9 {
    public static void main(String[] args) {
        MyDate mybirthDay = new MyDate();
        mybirthDay.year = 2025;
        mybirthDay.month = 2;
        mybirthDay.day = 30;

        System.out.printf("%d %d %d", mybirthDay.year, mybirthDay.month, mybirthDay.day);
    }

}

class MyDate {
    int year;
    int month;
    int day;

}

class MyDate2 {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDay() {
        if (this.month % 2 != 0) {

        }
    }

    public void leapYear(int inputYear) {
        if (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0) {
            this.year = inputYear;
        }
    }
}
