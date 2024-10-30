import java.util.Objects;

public class Author {
    private String name;
    private String Surname;

    public Author(String nameAuthor, String Surname) {
        this.name = nameAuthor;
        this.Surname = Surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.Surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    @Override
    public String toString() {
        return " Автор: " + getName() + " " + getSurname();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(Surname, author.Surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Surname);
    }
}
