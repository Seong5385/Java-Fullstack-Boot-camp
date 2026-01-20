package collections;

import java.io.*;
import java.util.*;

public abstract class Shape {
    private double length;
    private double height;

    public Shape(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public abstract double round();

    public abstract double area();
}

class Circle extends Shape {
    public Circle(double radius, double height) {
        super(radius, height);
    }

    @Override
    public double round() {
        return (2 * getLength()) * Math.PI;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getLength(), 2);
    }

    @Override
    public String toString() {
        return String.format("Circle" + "\n" + "넓이: " + area() + "\n" + "둘레: " + round());
    }
}

class Rectangle extends Shape {
    public Rectangle(double length, double height) {
        super(length, height);
    }

    @Override
    public double round() {
        return (getLength() + getHeight()) * 2;
    }

    @Override
    public double area() {
        return getHeight() * getLength();
    }

    @Override
    public String toString() {
        return String.format("Rectangle" + "\n" + "넓이: " + area() + "\n" + "둘레: " + round());
    }

}

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Shape> shapes = new ArrayList<Shape>();
        int n1, n2;

        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());

        shapes.add(new Circle(n1, n2));
        shapes.add(new Rectangle(n1, n2));

        shapes.forEach(System.out::println);

        System.out.print("도형들의 넓이 합: ");
        System.out.println(getArea(shapes));

        System.out.print("도형들의 둘레 합: ");
        System.out.println(getRound(shapes));
    }

    private static double getArea(List<Shape> shapes) {
        double result = 0;
        for (Shape s : shapes) {
            result += s.area();
        }

        return result;
    }

    private static double getRound(List<Shape> shapes) {
        double result = 0;
        for (Shape s : shapes) {
            result += s.round();
        }

        return result;
    }

}
