package org.example;

class DVD implements LibraryItem {
    private String title;

    // Реализация конструктора
    public DVD(String title) {
        this.title = title;
    }

    // Реализация метода getDescription
    @Override
    public String getDescription() {
        return "DVD: " + title;
    }
}
