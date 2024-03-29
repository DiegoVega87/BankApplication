package utilities;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    // This method will read data form a CSV file and return it as a list
    public static List<String[]> read(String file){
        List<String[]> data = new LinkedList<>();
        String dataRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((dataRow = br.readLine()) != null) {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return data;
    }
}
