package SS15_IOTextFile.bai_tap.ReadCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    private static List<String> getCSVline(String line){
        List<String> result = new ArrayList<>();
        if (line != null){
            String [] splitData = line.split(",");
            for (int i = 0; i < splitData.length; i++){
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("D:\\CodeGym\\CodeGymdn\\CodeGym\\module2\\src\\SS15_IOTextFile\\bai_tap\\ReadCSV\\country.csv"));

            while ((line = br.readLine()) != null) {
                printCountry(getCSVline(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
