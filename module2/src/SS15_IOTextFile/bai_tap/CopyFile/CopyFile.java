package SS15_IOTextFile.bai_tap.CopyFile;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public void readFile(String filepath) throws IOException, NumberFormatException {
        try {
            File file = new File(filepath);
            if (!file.exists()) throw new FileNotFoundException();
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum++;
            }
            System.out.println("Total lines: " + sum);
            bufferedReader.close();
        }catch (FileNotFoundException e){
            System.err.println("File does not exist!!");
        }
    }

    public void copyFile(String pathSource, String pathDest) throws IOException {
        File source = new File(pathSource);
        File dest = new File(pathDest);

        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = is.read(buffer)) > 0){
                os.write(buffer, 0 , length);
            }
        }finally {
            if (is != null){
                is.close();
            }
            if (os != null){
                os.close();
            }
        }
    }

    public static void main(String[] args) throws IOException, NumberFormatException{
        System.out.println("Link: ");
        Scanner scanner  = new Scanner(System.in);
        String path = scanner.nextLine();

        CopyFile copyFile = new CopyFile();
        copyFile.readFile(path);

        System.out.println("Copy Link: ");
        String pathDest = scanner.nextLine();

        copyFile.copyFile(path,pathDest);
        copyFile.readFile(pathDest);

    }
}
