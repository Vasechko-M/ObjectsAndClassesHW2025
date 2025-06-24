public class Book {
    private String name;
    private String author;
    int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = String.valueOf(author);
        this.year = year;
    }

    private String getName() {
        return name;
    }

    private String getAuthor() {
        return author;
    }

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
}
