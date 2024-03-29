package exercise01.SS16_IOBinaryFile.thuc_hanh.TH_Copy_file_dung_luong_lon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0){
                os.write(buffer, 0, length);
            }
        }finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input source file: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Input destination file: ");
        String destPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try{
            copyFileUsingJava7Files(sourceFile, destFile);
            System.out.printf("Copy done!");
        } catch (IOException ioe){
            System.out.printf("Can't Copy File!!");
            System.out.printf(ioe.getMessage());
        }
    }
}
