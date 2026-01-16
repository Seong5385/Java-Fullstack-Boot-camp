package class_.quiz;

import class_.quiz.classes.Account;

public class AccountMain {
    public static void main(String[] args) {
        Account ac = new Account("seong", 1234, 5678);
        System.out.println(ac);

        System.out.println(ac.saveMoney(10000));
        System.out.println(ac.withdrawMoney(1000));

        System.out.println(ac.getBalance());

    }
}
