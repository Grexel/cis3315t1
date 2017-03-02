package part2;

/**
 * Set the genre to romance. See SciFi example...
 *
 * @author Jeffrey Miller
 */
public class Romance extends Book {
    public Romance(String title, String author) {
        super(title, author);
    }

    @Override
    public String getGenre() {
        return "romance";
    }

}
