package com.company;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("--------zd1---------");

        Library library = new Library();
        List list = library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getIssueYear))
                .collect(Collectors.toList());
        System.out.println(list);

        System.out.println();
        System.out.println("--------zd2---------");

        List<EmailAddress> addresses = library.getReaders().stream()
                .map(Reader::getEmail)
                .map(EmailAddress::new)
                .collect(Collectors.toList());
        addresses.forEach(System.out::println);

        System.out.println();
        System.out.println("--------zd3--------");

        List<EmailAddress> addresses1 = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .filter(reader -> reader.getBooks().size() > 1)
                .map(Reader::getEmail).map(EmailAddress::new)
                .collect(Collectors.toList());
        System.out.println(addresses1);

        System.out.println();
        System.out.println("--------zd4--------");

        List<Book> bookList = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(bookList);

        System.out.println();
        System.out.println("--------zd5--------");

        boolean match = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .anyMatch(book -> "Moroz Oksana".equals(book.getAuthor()));
        System.out.println(match);



        System.out.println();
        System.out.println("--------zd6--------");
        Integer reduce = library.getReaders().stream()
                .map(reader -> reader.getBooks().size())
                .reduce(0, (max, size) -> size > max ? size : max);

        System.out.println(reduce);

        System.out.println();
        System.out.println("--------zd7--------");
        Map<String, List<Reader>> readerstMap = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK"));
        System.out.println(readerstMap);



    }
}
