package Zad4;

import java.io.*;

public class DataManagement {

    FileOutputStream fos = new FileOutputStream("data.txt");

    public DataManagement() throws FileNotFoundException {
    }

    public String readData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data;
        System.out.println("Podaj imię: ");
        data = br.readLine();
        System.out.println("Podaj nazwisko: ");
        data += " " + br.readLine();
        return data;
    }

    public void writeDataToFile() throws IOException {
        String data = readData();
        int bajt;
        for (int i = 0; i < data.length();i++){
            bajt = data.charAt(i);
            fos.write(bajt);
        }
        fos.write('\n');
    }

    public void readDataFromFile() throws IOException {
        FileInputStream fis = new FileInputStream("data.txt");
        int bajt;
        System.out.println("Zawartość pliku:\n");
        do {
            bajt=fis.read();
            if (bajt!=-1) System.out.print((char) bajt);
        }while (bajt!=-1);
    }
}
