package Task3;

public class ArrayMovieCollection {
    private String[] movies;
    private int index = 0;

    public ArrayMovieCollection(int size) {
        movies = new String[size];
    }

    public void addMovie(String movie) {
        if (index < movies.length) {
            movies[index++] = movie;
        }
    }

    public Iterator<String> iterator() {
        return new ArrayMovieIterator(movies);
    }
}

