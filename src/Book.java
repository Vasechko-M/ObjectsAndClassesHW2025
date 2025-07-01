import java.util.Objects;

public class Book {
    private String name;
    private Author author; //private String author    в этом случае работает закомменртированный код
    private int year;

    //public Book(String name, Author author, int year) {
      //  this.name = name;
        //this.author = String.valueOf(author);
      //  this.year = year;
    //}

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    private String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }
//private String getAuthor() {
     //   return author;
    //}

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return author + " год изнания " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }
}
