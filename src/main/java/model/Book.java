package model;

import java.math.BigDecimal;

public class Book extends Product {

    private Author author;

    public Book(String name, BigDecimal amount, String description, Publisher publisher, Author author) {
        super(name, amount, description, publisher);
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
