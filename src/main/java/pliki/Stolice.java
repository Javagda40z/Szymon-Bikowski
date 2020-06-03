package pliki;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class Stolice {
    public static void main(String[] args) {
        List<String> stolice = Arrays.asList("Madryt", "Warszawa", "Praga", "Londyn", "Budapeszt");

        try (PrintWriter printWriter = new PrintWriter("capitols.txt")) {
            stolice.forEach(printWriter::println); //stolica -> printWrite.println(stolica);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
