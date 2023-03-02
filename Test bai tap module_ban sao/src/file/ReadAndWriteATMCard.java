package file;

import model.ATM;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteATMCard {
    public List<ATM> ReadFile() {
        List<ATM> atmList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\data\\data"))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals(" ")) {
                    continue;
                }
                String[] result = line.split(",");
                if(result.length==5) {
                    String id = result[0];
                    String nameId = result[1];
                    String CCCD = result[2];
                    String address = result[3];
                    int surPlus = Integer.parseInt(result[4]);
                    ATM atm = new ATM(id, nameId,CCCD,address,surPlus );
                    atmList.add(atm);
                }


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return atmList;
    }

    public void WriteFile(List<ATM> atmList,boolean b) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\data\\data"))) {
            for (ATM e : atmList) {
                bufferedWriter.write(e.toString());
                bufferedWriter.write("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
