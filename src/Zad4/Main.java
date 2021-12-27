package Zad4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DataManagement dm = new DataManagement();

        dm.writeDataToFile();
        dm.writeDataToFile();
        dm.readDataFromFile();
    }
}
