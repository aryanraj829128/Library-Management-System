package library;

public class Book {
    private String genre;
    private String title;
    private String author;
    private String locationid;
    private String position;

    public Book(String genre, String title, String author, String locationid, String position) {
        this.genre = genre;
        this.title = title;
        this.author = author;
        this.locationid = locationid;
        this.position = position;
    }

    public String getTitle(){
        return title;
    }


    public String getLocationid() {
        return locationid;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Book{" +
                "genre='" + genre + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", locationid='" + locationid + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
