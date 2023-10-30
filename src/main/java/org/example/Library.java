package org.example;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<LibraryItem> items;

    // Реализуем конструктор
    public Library() {
        items = new ArrayList<>();
    }

    // Реализацуем метод addItem
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    // Реализацуем метод listItems
    public void listItems() {
        for (LibraryItem item : items) {
            System.out.println(item.getDescription());
        }
    }


    public static void main(String[] args) {
        // Создаем объекты Book и DVD и добавьте их в объект Library
        Library library = new Library();
        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        DVD dvd1 = new DVD("Inception");
        library.addItem(book1);
        library.addItem(dvd1);

        // Выведим список всех элементов библиотеки
        library.listItems();

        // Сравним элементы библиотеки с использованием интерфейса IComparable<LibraryItem>
        System.out.println(book1.compareTo(dvd1) > 0 ? "Book is greater" : "DVD is greater");

        // Проверим элементы библиотеки на равенство с использованием интерфейса IEquatable<LibraryItem>
        System.out.println(book1.equals(dvd1) ? "Objects are equal" : "Objects are not equal");
    }
}
