package pl.pjatk;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,3));
        readFromFile();
    }

    public static void  readFromFile() throws IOException {
        File file = new File("testFile.txt");
        String text = FileUtils.readFileToString(file, "utf-8");
        System.out.println(text);
    }

    public void writeToFile(String text) {
//        FileUtils.writeStringToFile();
    }
}
