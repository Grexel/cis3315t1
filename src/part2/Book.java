package part2;

/**
 * Defines the attributes and methods of a book object. Add the getters, setters. Add
 * a toString methods that prints the book title, author, and genre. 
 *
 * @author Jeffrey Miller
 */
public abstract class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public abstract String getGenre();

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

    @Override
    public String toString() {
        return title + " by " + author + " in genre " + getGenre();
    }
    
    
}
