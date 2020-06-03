package pliki2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {
    public static void main(String[] args) {
        Path path = Paths.get("file.txt");
        System.out.println(path.toAbsolutePath());

        try {
//            Files.readAllLines(path).forEach(linia -> System.out.println(linia));  // wczytuje wszystkie linie do pamięci
            Files.lines(path).forEach(linia -> System.out.println(linia));         // otwiera strumień i wczytuje linijaka po linijce

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.write(path, "jakiś tekst".getBytes());
            BufferedWriter bufferedWriter = Files.newBufferedWriter(path);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
