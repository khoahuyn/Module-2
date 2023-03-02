package file;


import model.ReditCard;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteReditCard {
    public List<ReditCard> ReadFile() {
        List<ReditCard> atmList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\data\\data"))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals(" ")) {
                    continue;
                }
                String[] result = line.split(",");
                if(result.length==6) {
                    String id = result[0];
                    String nameId = result[1];
                    String CCCD = result[2];
                    String address = result[3];
                    int debt = Integer.parseInt(result[4]);
                    int creditLimit = Integer.parseInt(result[5]);
                    ReditCard atm = new ReditCard(id, nameId, CCCD, address, debt, creditLimit);
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

    public void WriteFile(List<ReditCard> atmList,boolean b) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\data\\data"))) {
            for (ReditCard e : atmList) {
                bufferedWriter.write(e.toString());
                bufferedWriter.write("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
