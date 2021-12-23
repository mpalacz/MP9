package Zad5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj trzy pierwsze liczby konta bankowego: ");
        String accountNumber = br.readLine();

        try (BufferedReader br2 = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            System.out.println("Odczytuje dane z pliku");
            while ((line = br2.readLine()) != null) {
                String[] words = line.split("\\t+");
                String bankNumber = words[0].trim();
                String bankName = words[1].trim();
                if (bankNumber.equals(accountNumber)) {
                    System.out.println("Numer banku: " + bankNumber + " Nazwa Twojego banku to: " + bankName);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd wczytania danych");
        }
    }
}