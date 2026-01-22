package collections.quiz;

import java.util.*;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("상품명: " + name + " | " + "가격: " + price);
    }
}

class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("신발", 80000));
        products.add(new Product("가방", 100000));
        products.add(new Product("지갑", 1000000));

        System.out.print("입력된 상품: ");
        System.out.println(products.size() + "개");
        products.forEach(System.out::println);

        products.remove(1);

        System.out.print("입력된 상품: ");
        System.out.println(products.size() + "개");
        products.forEach(System.out::println);

    }
}
