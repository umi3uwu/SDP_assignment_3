package Task3;

public class Main {
    public static void main(String[] args) {
        // List-based movie collection
        ListMovieCollection listCollection = new ListMovieCollection();
        listCollection.addMovie("Movie Na");
        listCollection.addMovie("Movie Ru");
        listCollection.addMovie("Movie To");

        // Array-based movie collection
        ArrayMovieCollection arrayCollection = new ArrayMovieCollection(3);
        arrayCollection.addMovie("Movie Sa");
        arrayCollection.addMovie("Movie Su");
        arrayCollection.addMovie("Movie Ke");

        // Iterate over list-based collection
        System.out.println("Movies in ListMovieCollection:");
        Iterator<String> listIterator = listCollection.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Iterate over array-based collection
        System.out.println("\nMovies in ArrayMovieCollection:");
        Iterator<String> arrayIterator = arrayCollection.iterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }
}

