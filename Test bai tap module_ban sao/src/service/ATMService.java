package service;

import file.ReadAndWrite;
import model.ATM;
import service.CardService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATMService implements CardService {
    List<ATM> cards = new ArrayList<>();
    ReadAndWrite readAndWrite=new ReadAndWrite();

    Scanner nhap=new Scanner(System.in);

    public void reGistration() {
        cards=readAndWrite.readATM();
        ATM add = new ATM();
            add.inPutCard();
            cards.add(add);
            readAndWrite.writeATM(cards,true);

    }

    @Override
    public void disPlay() {
        cards=readAndWrite.readATM();
        for (ATM e:cards) {
            if(cards.contains(e))
                System.out.println(e);
        }
    }


    @Override
    public void searchCard() {
        cards=readAndWrite.readATM();
        System.out.print("Nhap CCCD cua nguoi can tim:");
        String find=nhap.nextLine();
        int dem=0;
        for (int i = 0; i <cards.size() ; i++) {
            if(cards.get(i).getCCCD().equals(find)){
                find= String.valueOf(cards.get(i));
                dem++;
            }
        }
        if(dem!=0){
            System.out.println("Sucessfull,The information you need:");
            System.out.println(find);
        }else {
            System.out.println("Not Found!!!");
        }
    }

    @Override
    public void reMove() {
        cards=readAndWrite.readATM();
        System.out.print("Nhap so the cua nguoi can xoa:");
        String find=nhap.nextLine();
        int dem=0;
        for (int i = 0; i <cards.size() ; i++) {
            if(cards.get(i).getNumId().equals(find)){
                cards.remove(i);
                readAndWrite.writeATM(cards,false);
                dem++;
            }
        }
        if(dem!=0){
            System.out.println("The information you need to remove Sucessfull:");
        }else {
            System.out.println("Not Found!!!");
        }
    }


    @Override
    public void reCharge() {
        cards=readAndWrite.readATM();
        System.out.print("Nhap so the cua nguoi can thanh toan:");
        String find=nhap.nextLine();
        int dem=0;
        for (int i = 0; i <cards.size() ; i++) {
            if(cards.get(i).getNumId().equals(find)){
                System.out.print("Nhap so tien can them vao:");
                cards.get(i).setSurPlus(Integer.parseInt(nhap.nextLine()));
                readAndWrite.writeATM(cards,false);
                dem++;
            }
        }
        if(dem!=0){
            System.out.println("You have successfully recharged:");
        }else {
            System.out.println("Not Found!!!");
        }
    }



}
