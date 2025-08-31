import java.io.*;
import java.util.*;

public class MissingValuesCheck {
    public static void main(String[] args) {
        String path = "water_potability.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String header = br.readLine();
            String[] columns = header.split(",");
            int[] missingCount = new int[columns.length];

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (int i = 0; i < values.length; i++) {
                    if (values[i] == null || values[i].trim().isEmpty()) {
                        missingCount[i]++;
                    }
                }
            }

            System.out.println("Missing Values Report:");
            for (int i = 0; i < columns.length; i++) {
                System.out.println(columns[i] + " : " + missingCount[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
