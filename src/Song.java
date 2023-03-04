import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Song {
    private String title;
    private String author;
    private String text;

    public Song(String title, String author, String text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }
    }
