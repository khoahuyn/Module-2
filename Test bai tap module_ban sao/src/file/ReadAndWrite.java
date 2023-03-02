package file;

import model.ATM;
import model.ReditCard;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<String> ReadFile(String path) {
        List<String> strings = new ArrayList<>();
        String line = null;
        path="src\\data\\data";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals(" ")) {
                    continue;
                }
                strings.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public  List<ATM> readATM(){
        List<String> list = ReadFile("src\\data\\data");
        List<ATM> atmList = new ArrayList<>();
        String[]result=null;
        for (int i = 0; i <list.size() ; i++) {
            result = list.get(i).split(",");
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

        return atmList;
    }


    public  List<ReditCard> readReditCard(){
        List<String> list = ReadFile("src\\data\\data");
        List<ReditCard> reditCards = new ArrayList<>();
        String[]result=null;
        for (int i = 0; i <list.size() ; i++) {
            result = list.get(i).split(",");
            if(result.length==6) {
                String id = result[0];
                String nameId = result[1];
                String CCCD = result[2];
                String address = result[3];
                int debt = Integer.parseInt(result[4]);
                int creditLimit = Integer.parseInt(result[5]);
                ReditCard atm = new ReditCard(id, nameId, CCCD, address, debt, creditLimit);
                reditCards.add(atm);
            }
        }

        return reditCards;
    }

    public void WriteFile(List<String> list,boolean b) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\data\\data"))) {
            for (String e : list) {
                bufferedWriter.write(e.toString());
                bufferedWriter.write("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  void writeATM(List<ATM> atmList, boolean b){
        List<String> string = new ArrayList<>();
        for(ATM atm : atmList){
            string.add(atm.toString());
        }
        WriteFile(string,  b);
    }

    public  void writeCardRedit(List<ReditCard> reditCards, boolean b){
        List<String> string = new ArrayList<>();
        for(ReditCard reditCard : reditCards){
            string.add(reditCard.toString());
        }
        WriteFile(string,  b);
    }




}
