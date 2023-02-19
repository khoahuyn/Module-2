package thaotacfile;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = WriteReadFile.readToFile(".\\src\\thaotacfile\\student.dat");
        list.forEach(System.out::println);
        WriteReadFile.writeToFile(".\\src\\thaotacfile\\student.dat",list);
    }
}
