public class Novel extends Book {
    String Genre;

    public String getGenre() {
        return this.Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public Novel() {
        super();
        Genre = "Drama";
    }

    public Novel(String Genre, String title, int year, double price) {
       super(title,year,price);
        this.Genre = Genre;
    }

    public void print() {
        System.out.println("Genre" + Genre);
    }
}

