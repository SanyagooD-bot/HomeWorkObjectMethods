public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа Методы объектов");

        Author author = new Author("Александр", "Пушкин");
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Лев", "Толстой");
        Book book = new Book("Капитанская дочка", author, 1836);
        Book book1 = new Book("Война и мир", author1, 1863);
        Book book2 = new Book("Война и мир", author1, 1863);
        book1.setYearBook(2024);
        book1.setNameBook("Мир и война");
        System.out.println(book + "      " + author);
        System.out.println(book1 + "      " + author1);
        System.out.println(book2 + "      " + author2);

        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book1.equals(book2));

        System.out.println(author.hashCode());
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
        System.out.println(author1.equals(author2));

    }
}