package org.example;

public class Main {
    public static void main(String[] args) {
        // Создайте объекты Book и DVD и добавьте их в объект Library
        Library library = new Library();
        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        DVD dvd1 = new DVD("Inception");
        library.addItem(book1);
        library.addItem(dvd1);

        // Выведим список всех элементов библиотеки
        library.listItems();

        // Сравним элементы библиотеки с использованием интерфейса Comparable<LibraryItem>
        System.out.println(book1.compareTo(dvd1) > 0 ? "Book is greater" : "DVD is greater");

        // Проверим элементы библиотеки на равенство с использованием интерфейса IEquatable<LibraryItem>
        System.out.println(book1.equals(dvd1) ? "Objects are equal" : "Objects are not equal");
    }
}