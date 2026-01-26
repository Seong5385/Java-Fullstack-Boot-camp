package collections.quiz;

import java.util.*;
import java.io.*;

public class Cart {
    public static void main(String[] args) throws IOException {
        Buyer buyer = new Buyer(500000);

        buyer.addToCart(new Coffee(10000, "이디야 원두"));
        buyer.addToCart(new Coffee(15000, "커피빈 원두"));
        buyer.addToCart(new Coffee(20000, "스타벅스 원두"));
        buyer.addToCart(new Coffee(10000, "이디야 원두"));
        buyer.addToCart(new Coffee(15000, "커피빈 원두"));
        buyer.addToCart(new Coffee(20000, "스타벅스 원두"));
        buyer.addToCart(new Coffee(10000, "이디야 원두"));
        buyer.addToCart(new Coffee(15000, "커피빈 원두"));
        buyer.addToCart(new Coffee(20000, "스타벅스 원두"));
        buyer.addToCart(new Coffee(10000, "이디야 원두"));
        buyer.addToCart(new Coffee(15000, "커피빈 원두"));
        buyer.addToCart(new Coffee(20000, "스타벅스 원두"));
        buyer.addToCart(new Coffee(10000, "이디야 원두"));
        buyer.addToCart(new Coffee(15000, "커피빈 원두"));
        buyer.addToCart(new Coffee(20000, "스타벅스 원두"));
        buyer.addToCart(new Coffee(10000, "이디야 원두"));
        buyer.addToCart(new Coffee(15000, "커피빈 원두"));
        buyer.addToCart(new Coffee(20000, "스타벅스 원두"));
        buyer.addToCart(new Coffee(10000, "이디야 원두"));
        buyer.addToCart(new Vaccine(69000, "V3"));

        System.out.println("=".repeat(11) + "카트 정보" + "=".repeat(11));
        buyer.viewCart();

        buyer.buyAll();
        buyer.receipt();

        System.out.println("=".repeat(11) + "트렁크 정보" + "=".repeat(11));
        buyer.viewTrunk();
    }
}

class Coffee extends Product {

    public Coffee(int price, String name) {
        super(name, price);
    }

    public void drink() {
        System.out.println("원두 향을 즐깁니다.");
    }
}

class Buyer {

    private static final List<Product> cart = new ArrayList<>();
    private static final List<Product> trunk = new ArrayList<>();
    private int cash;
    private int total;

    public Buyer(int cash) {
        this.cash = cash;
    }

    public void buy() {

    }

    public void buyAll() {
        trunk.addAll(cart);
    }

    public void receipt() {
        cart.forEach(products -> total += products.getPrice());
        System.out.printf("\n추가된 제품의 값: %,d\n", this.total);
        System.out.printf("남은 금액: %,d\n\n", this.cash - this.total);
    }

    public void clearCart() {
        cart.clear();
    }

    public void addToCart(Product p) {
        cart.add(p);
    }

    public void viewCart() {
        cart.forEach(System.out::println);
    }

    public void viewTrunk() {
        trunk.forEach(System.out::println);
    }
}

class SmartPhone extends Product {
    SmartPhone(int price, String name) {
        super(name, price);
    }

    public void call() {
        System.out.println("전화를 합니다.");
    }
}

class Vaccine extends Product {
    Vaccine(int price, String name) {
        super(name, price);
    }

    public void checkComputer() {
        System.out.println(super.getName() + "이 컴퓨터를 검사합니다.");
    }

}
