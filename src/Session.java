import java.io.Serializable;

public class Session implements Serializable {
    private String title;
    private Film author;

    public void Film(String title, Film author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Film getAuthor() {
        return author;
    }

    public void setAuthor(Film author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Film{" + "title='" + title + '\'' + ", author=" + author + '}';
    }
}

