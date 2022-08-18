import java.util.Objects;

public class Book {
    private String titel;
    private int yearPublish;
    private Author author;

    public Book(String titel, int yearPublish, Author author) {
        this.titel = titel;
        this.yearPublish = yearPublish;
        this.author = author;
    }

    public String getTitel() {
        return titel;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    @Override
    public String toString() {
        return "Книга: " + titel + " " + "Год издания: " + yearPublish +" " + "Автор: " + author;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublish == book.yearPublish && Objects.equals(titel, book.titel) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, author);
    }
}
