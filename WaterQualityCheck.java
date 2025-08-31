import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WaterQualityCheck {
    public static void main(String[] args) {
        String path = "water_potability.csv";
        String line = "";
        int rowCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null && rowCount < 6) { 
                // print first 5 rows
                System.out.println(line);
                rowCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
