package service;

import file.ReadAndWrite;
import model.ReditCard;
import service.CardService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReditCardService implements CardService {
    List<ReditCard> reditCards = new ArrayList<>();
    ReadAndWrite readAndWrite = new ReadAndWrite();

    Scanner nhap=new Scanner(System.in);

    public void reGistration() {
        reditCards = readAndWrite.readReditCard();
        ReditCard add = new ReditCard();
        add.inPutCard();
        reditCards.add(add);
        readAndWrite.writeCardRedit(reditCards,true);
    }

    @Override
    public void disPlay() {
        reditCards = readAndWrite.readReditCard();
        for (ReditCard e : reditCards) {
            if(reditCards.contains(e))
            System.out.println(e);
        }
    }


    @Override
    public void searchCard() {
        reditCards = readAndWrite.readReditCard();
        System.out.print("Nhap CCCD cua nguoi can tim:");
        String find=nhap.nextLine();
        int dem=0;
        for (int i = 0; i <reditCards.size() ; i++) {
            if(reditCards.get(i).getCCCD().equals(find)){
                find= String.valueOf(reditCards.get(i));
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
        reditCards = readAndWrite.readReditCard();
        System.out.print("Nhap so the cua nguoi can xoa:");
        String find=nhap.nextLine();
        int dem=0;
        for (int i = 0; i <reditCards.size() ; i++) {
            if(reditCards.get(i).getNumId().equals(find)){
                reditCards.remove(i);
                readAndWrite.writeCardRedit(reditCards,false);
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
        reditCards = readAndWrite.readReditCard();
        System.out.print("Nhap so the cua nguoi can thanh toan:");
        String find=nhap.nextLine();
        int dem=0;
        for (int i = 0; i <reditCards.size() ; i++) {
            if(reditCards.get(i).getNumId().equals(find)){
                System.out.print("Nhap so tien can them vao:");
                reditCards.get(i).setDebt(Integer.parseInt(nhap.nextLine()));
                readAndWrite.writeCardRedit(reditCards,false);
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
