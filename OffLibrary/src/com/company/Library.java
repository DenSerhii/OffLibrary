package com.company;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        init();
    }

    private void init() {
        books = new ArrayList<>();
        books.add(new Book("Orwell", "1984", 2019));
        books.add(new Book("Boris Johnson", "The Churchill factor", 2022));
        books.add(new Book("Moroz Oksana", "How not to become a vegetable", 2021));
        books.add(new Book("Gregory Zuckerman", "The man who hacked the market", 2021));
        // і так далі для інших книг

        readers = new ArrayList<>();
        readers.add(new Reader("Ivanov Ivan Ivanovich", "ivanov.email@test.ua", true));
        readers.add(new Reader("Ivanov Serhii Serhiovych", "ser.email@test.ua", true));
        readers.add(new Reader("Ivanov Dmytro Dmytrovych", "dmtro.email@test.ua", false));
        //і так далі для інших читачів

        readers.get(0).getBooks().add(books.get(1));
        readers.get(1).getBooks().add(books.get(0));
        readers.get(1).getBooks().add(books.get(1));
        readers.get(1).getBooks().add(books.get(2));
        readers.get(2).getBooks().add(books.get(3));
        //і так далі для інших читачів і взятих книг
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

}