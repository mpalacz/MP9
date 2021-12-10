package Zad2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) throws IOException {
        int bajt;

        try (FileInputStream fis = new FileInputStream("plik.txt")) {
            do {
                bajt = fis.read();
                if (bajt != -1) System.out.println((char) bajt);
            } while (bajt != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
            return;
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku");
        }
    }
}
