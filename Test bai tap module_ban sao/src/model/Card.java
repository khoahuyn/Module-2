package model;

import java.util.Scanner;

public abstract class Card {
    private String numId;
    private String nameId;
    private String CCCD;
    private String address;

    Scanner nhap = new Scanner(System.in);

    public Card(String numId, String nameId, String CCCD, String address) {
        this.numId = numId;
        this.nameId = nameId;
        this.CCCD = CCCD;
        this.address = address;
    }

    public Card(){

    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "" + numId +
                "," + nameId  +
                "," + CCCD  +
                "," + address;
    }

    public void inPutCard() {
        System.out.print("Nhap vao so the:");
        this.numId = nhap.nextLine();
        System.out.print("Nhap vao ten chu the:");
        this.nameId = nhap.nextLine();
        System.out.print("Nhap vao can cuoc cong dan:");
        this.CCCD = nhap.nextLine();
        System.out.print("Nhap vao dia chi:");
        this.address = nhap.nextLine();
    }
}

