package class_.classes;

public class Pen {
    private String color;
    private int price;

    public Pen(String c, int p) {
        this.color = c;
        this.price = p;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s색의 펜은 %d원 입니다.", color, price);
    }

    public void write() {
        System.out.println("Hello world!");
    }
}
