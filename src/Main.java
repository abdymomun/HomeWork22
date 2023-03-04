import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {

        String fileName = "song.txt";
        String title = "Metllica";
        String author = "Metllica";
        String text = "Nothing else Matters";

            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            title = scanner.nextLine();
            author = scanner.nextLine();
            while (scanner.hasNextLine()) {
                text += scanner.nextLine() + "\n";
            }
            scanner.close();

        Song song = new Song(title, author, text);
        System.out.println("Title: " + song.getTitle());
        System.out.println("Author: " + song.getAuthor());
        System.out.println("Text:\n" + song.getText());
    }

        }



