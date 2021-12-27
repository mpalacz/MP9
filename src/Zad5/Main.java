package Zad5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        System.out.println("Podaj trzy pierwsze liczby konta bankowego: ");
        input = br.readLine();
        char[] inputArray = {input.charAt(0), input.charAt(1), input.charAt(2)};
        char[] bajtArray = new char[3];
        int bajt;

        try (FileInputStream fis = new FileInputStream("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt")) {
            do {
                bajt = fis.read();

            } while (bajt != -1);
        }
    }
}
