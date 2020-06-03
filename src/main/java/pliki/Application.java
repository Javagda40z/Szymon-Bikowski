package pliki;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try (PrintWriter printWriter = new PrintWriter("file.txt")) {
            printWriter.println("Linia pierwsza...");
            printWriter.println("Linia druga...");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File file = new File("file.txt");
        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isDirectory());


    }
}
