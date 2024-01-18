package Aula110124.Book;

public class Book {

    public String title;
    public String author;
    public String publishmentYear;
    public String genre;

    public Book(String title, String author, String publishmentYear, String genre) {
        this.title = title;
        this.author = author;
        this.publishmentYear = publishmentYear;
        this.genre = genre;
    }

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishmentYear() {
        return publishmentYear;
    }

    public void setPublishmentYear(String publishmentYear) {
        this.publishmentYear = publishmentYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishmentYear='" + publishmentYear + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
