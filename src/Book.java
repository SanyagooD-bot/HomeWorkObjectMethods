import java.util.Objects;

public class Book {
    private String nameBook;
    private Author authorBook;
    private int yearBook;

    public Book(String nameBook, Author authorBook, int yearBook) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.yearBook = yearBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthorBook() {
        return this.authorBook;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    @Override
    public String toString() {
        return " Название книги: " + getNameBook() + " Год публикации: " + getYearBook() + getAuthorBook();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return yearBook == book.yearBook && Objects.equals(nameBook, book.nameBook) && Objects.equals(authorBook, book.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, authorBook, yearBook);
    }
}
