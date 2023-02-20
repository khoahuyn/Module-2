import java.io.*;
import java.util.Collections;
import java.util.List;

public class Operation {
    public static void writeToFile(String path, List<Product>list){
        try (ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(path))){
            outputStream.writeObject(list);
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readFromFile(String path){
        try (ObjectInputStream inputStreamb=new ObjectInputStream(new FileInputStream(path))){
            return (List<Product>)inputStreamb.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
