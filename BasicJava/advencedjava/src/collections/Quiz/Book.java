package collections.quiz;

import java.io.*;
import java.util.*;

public class Book {
    private int isbn;
    private String title;
    private String author;
    private int price;

    public Book(int isbn, String title, String author, int price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + "]";
    }

}

class MainBook {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("ISBN: ");
            int isbn = Integer.parseInt(br.readLine());

            System.out.print("Title: ");
            String title = br.readLine();

            System.out.print("Author: ");
            String author = br.readLine();

            System.out.print("Price: ");
            int price = Integer.parseInt(br.readLine());

            books.add(new Book(isbn, title, author, price));

            System.out.print("계속 하시겠습니까(Y/N)?: ");
            String cmd = br.readLine();
            if (cmd.toUpperCase().equals("N")) {
                break;
            }
        }

        books.stream().sorted(Comparator.comparing(Book::getPrice)).forEach(System.out::println);
        System.out.println("정렬 완료");

        System.out.print("찾을 책의 제목을 입력하세요: ");
        String searchTitle = br.readLine();

        books.stream().filter(b -> b.getTitle().equals(searchTitle)).forEach(System.out::println);

        System.out.print("삭제할 도서 이름을 입력하세요: ");
        String title = br.readLine();

        books.removeIf(book -> book.getTitle().equals(title));
    }
}
