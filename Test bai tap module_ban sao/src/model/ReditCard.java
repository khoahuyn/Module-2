package model;

import model.Card;

public class ReditCard extends Card {
    private int debt=0;
    private int creditLimit;

    public ReditCard(String numId, String nameId, String CCCD, String address, int debt, int creditLimit) {
        super(numId, nameId, CCCD, address);
        this.debt = debt;
        this.creditLimit = creditLimit;
    }

    public ReditCard() {
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return super.toString()+"," + debt +
                "," + creditLimit ;
    }

    @Override
    public void inPutCard() {
        super.inPutCard();
        System.out.print("Nhap han muc:");
        this.creditLimit=Integer.parseInt(nhap.nextLine());
    }
}
