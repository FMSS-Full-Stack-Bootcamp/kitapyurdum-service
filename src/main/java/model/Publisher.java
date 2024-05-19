package model;

import java.time.LocalDate;
import java.util.List;

public class Publisher {

    private String name;
    private LocalDate creatDate;
    //private List<Book> bookList; //model olarak bunu yapmadık.

    public Publisher(String name, LocalDate creatDate) {
        this.name = name;
        this.creatDate = creatDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(LocalDate creatDate) {
        this.creatDate = creatDate;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", creatDate=" + creatDate +
                '}';
    }
}
