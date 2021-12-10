package Zad3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int bajt;

        try (FileInputStream fis = new FileInputStream("plik.txt")) {
            FileOutputStream fos = new FileOutputStream("output.txt");
            do {
                bajt = fis.read();
                if (bajt != -1) {
                    if (bajt == ' ')
                        bajt = '-';
                    fos.write(bajt);
                }
            } while (bajt != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
            return;
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku");
        }

    }
}
