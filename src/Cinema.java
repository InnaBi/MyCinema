import java.io.Serializable;
        import java.util.ArrayList;
        import java.util.List;

public class Cinema implements Serializable {
    private List<Film> films;
    private List<Film> authors;

    public Cinema() {
        films = new ArrayList<>();
        authors = new ArrayList<>();
    }

    public List<Film> getFilms() {
        return films;
    }

    public List<Film> getAuthors() {
        return authors;
    }
}

