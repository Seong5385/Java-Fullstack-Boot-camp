package generic;

import java.util.*;

public class GenericsEx {
    public static void main(String[] args) {
        Wallet<Card, Money> cardWallet1 = new Wallet<Card, Money>("blue");
        Wallet<CreditCard, Money> cardWallet2 = new Wallet<>("red");

        cardWallet1.setPouch1(new CreditCard());
        cardWallet1.setPouch1(new CheckCard());
        cardWallet1.setPouch1(new TrafficCard());

        cardWallet2.setPouch2(new Won());
        cardWallet2.setPouch2(new Dollar());

    }

    public static void usingArrayListMethod(Wallet<? extends Card, ? extends Money> w) { // ?: 부모로 상속 받는 클래스들은 다 가능
        System.out.println(w);
    }

    public static void usingArrayListMethod(ArrayList<?> list) {
        System.out.println(list);
    }
}

class Card {

}

class Money {

}

class CreditCard extends Card {

}

class CheckCard extends Card {

}

class TrafficCard extends Card {

}

class Won extends Money {

}

class Dollar extends Money {

}

class Wallet<One extends Card, Two extends Money> {
    private List<One> pouch1;
    private List<Two> pouch2;
    private String color;

    public Wallet(String color) {
        pouch1 = new ArrayList<>();
        pouch2 = new ArrayList<>();
        this.color = color;
    }

    public void setPouch1(One o) {
        pouch1.add(o);
    }

    public void setPouch2(Two t) {
        pouch2.add(t);
    }

    public One getPouch1(int i) {
        return pouch1.get(i);
    }

    public Two getPouch2(int i) {
        return pouch2.get(i);
    }

    public String getColor() {
        return color;
    }
}
