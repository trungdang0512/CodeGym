package exercise01.final_exam_02.util;

import exercise01.final_exam_02.model.Account;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper <T> {
    public List<String> read(String path) throws NumberFormatException{
        List<String> result = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;

            while ((line = reader.readLine()) != null) {
                if(!line.isEmpty()){
                    result.add(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public void write(String path, List<Account> accounts, boolean isAppend) throws NumberFormatException{
        try(BufferedWriter write = new BufferedWriter(new FileWriter(path, isAppend))) {
            for (Account p : accounts){
                write.write(p.toString());
                write.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    private void createFileIfNotExists(String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
