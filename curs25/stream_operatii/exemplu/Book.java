package curs25.stream_operatii.exemplu;

import java.util.Objects;

public class Book {

    private String author;
    private String name;
    private Double price;

    public Book(String author, String name, Double price) {
        this.author = author;
        this.name = name;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(name, book.name) && Objects.equals(price, book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, price);
    }
}
