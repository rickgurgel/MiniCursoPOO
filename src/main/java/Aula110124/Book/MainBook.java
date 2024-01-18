package Aula110124.Book;


public class MainBook {
    public static void main(String[] args) {

        Book book1 = new Book("Lord Of Flies", "William Goldin", "1954","Novel");
        Book book2 = new Book("A Clockwork  Orange", "Sci-Fi");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}