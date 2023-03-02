package model;

public class ATM extends Card {
    private int surPlus=0;

    public ATM(String numId, String nameId, String CCCD, String address, int surPlus) {
        super(numId, nameId, CCCD, address);
        this.surPlus = surPlus;
    }

    public ATM() {

    }

    public int getSurPlus() {
        return surPlus;
    }

    public void setSurPlus(int surPlus) {
        this.surPlus = surPlus;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                surPlus;
    }

    @Override
    public void inPutCard() {
        super.inPutCard();
    }
}
