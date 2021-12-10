package Zad1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        int bajt;

        try {
            fis = new FileInputStream("plik.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
            return;
        }
        try {
            do {
                bajt = fis.read();
                if (bajt != -1) System.out.println((char) bajt);
            } while (bajt != -1);
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku");
        } finally {
            fis.close();
        }
    }
}
