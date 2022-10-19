package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Reader {
    private String fullName; //ПІБ
    private String email; //електронний адрес
    private boolean subscriber; //погодження на розсилку
    private List<Book> books; //взяті книги

    public Reader(String fio, String email, boolean subscriber) {
        this.fullName = fio;
        this.email = email;
        this.subscriber = subscriber;
        this.books = new ArrayList<>();
    }

    public boolean isSubscriber() {
        return subscriber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Reader reader = (Reader) o;
        return fullName.equals(reader.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

}
