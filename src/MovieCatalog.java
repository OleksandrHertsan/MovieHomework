import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MovieCatalog {
    private List<Movie> movies;


    public MovieCatalog() {
        movies = new ArrayList<>();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }


    public void addMovie(String title, int releaseDate, String genre, double rating) {
        if (!movies.contains(new Movie(title, releaseDate, genre, rating))) {
            movies.add(new Movie(title, releaseDate, genre, (rating)));
        }
    }

    public void remove(String title) {
        List<Movie> newList = movies.stream()
                .filter(movie -> !movie.getTitle().equals(title))
                .toList();
        setMovies(newList);
    }

    public void updateTitle(String oldTitle, String newTitle) {
        movies.stream()
                .filter(m -> m.getTitle().equals(oldTitle))
                .forEach(m -> {
                    System.out.println(m.getTitle() + ": title changed to '" + newTitle + "'");
                    m.setTitle(newTitle);
                });
    }

    public void updateRating(String title, double newRating) {
        movies.stream()
                .filter(m -> m.getTitle().equals(title))
                .forEach(m -> {
                    m.setRating(newRating);
                    System.out.println(m.getTitle() + ": rating changed to " + newRating);
                });
    }

    public void updateReleaseDate(String title, int newReleaseDate) {
        movies.stream()
                .filter(m -> m.getTitle().equals(title))
                .forEach(m -> {
                    m.setReleaseDate(newReleaseDate);
                    System.out.println(m.getTitle() + ": release date changed to " + newReleaseDate);
                });
    }

    public void updateGenre(String title, String newGenre) {
        movies.stream()
                .filter(m -> m.getTitle().equals(title))
                .forEach(m -> {
                    m.setGenre(newGenre);
                    System.out.println(m.getTitle() + ": genre changed to " + newGenre);
                });
    }

    public void searchByTitle(String word) {
        movies.stream()
                .filter(m -> m.getTitle()
                        .toLowerCase()
                        .matches(".*\\b" + word.toLowerCase() + "\\b.*"))
                .forEach(System.out::print);
    }

    public void searchByReleaseDate(int year) {
        movies.stream()
                .filter(m -> m.getReleaseDate() == year)
                .forEach(System.out::print);
    }

    public void searchByReleaseDate(int from, int to) {
        movies.stream()
                .filter(m -> m.getReleaseDate() >= from && m.getReleaseDate() <= to)
                .forEach(System.out::print);
    }

    public void searchByGenre(String genre) {
        movies.stream()
                .filter(m -> m.getGenre().equals(genre))
                .forEach(System.out::print);
    }

    public void searchByRating(double from, double to) {
        movies.stream()
                .sorted(Comparator.comparing(Movie::getRating))
                .filter(m -> m.getRating() >= from && m.getRating() <= to)
                .forEach(System.out::print);
    }

    public void searchByRating(double rating) {
        movies.stream()
                .sorted(Comparator.comparing(Movie::getRating).reversed())
                .takeWhile(m -> m.getRating() >= rating)
                .forEach(System.out::print);
    }

}
