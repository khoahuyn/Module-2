package thaotacfile;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFile {
    public static void writeToFile(String path, List<String> list) {
        try (BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(path))){
            for (String string:list) {
                bufferedWriter.write(string);
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readToFile(String path){
        List<String> list = new ArrayList<>();
        try (BufferedReader br=new BufferedReader(new FileReader(path))){
            String line = null;
            while ((line = br.readLine()) != null){
                list.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }


}
