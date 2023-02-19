package docfile;

import thaotacfile.WriteReadFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static List<String> readToFile(String path) {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                list.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> list = WriteReadFile.readToFile(".\\src\\docfile\\dstp.csv");
        list.forEach(System.out::println);
        WriteReadFile.writeToFile(".\\src\\docfile\\dstp.csv",list);
    }
}
