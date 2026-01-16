package class_.quiz.classes;

public class Account {
    private String name;
    private int account;
    private int password;
    private int balance;
    private int interest;

    public Account(String na, int ac, int pa) {
        this.name = na;
        this.account = ac;
        this.password = pa;
    }

    public int saveMoney(int money) {
        balance += money;
        return balance;
    }

    public int withdrawMoney(int money) {
        balance -= money;
        return balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d, %d, %d", name, account, password, balance, interest);
    }
}
