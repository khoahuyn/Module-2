package controller;


import service.ATMService;
import service.ReditCardService;

import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);
    ATMService atmService = new ATMService();
    ReditCardService reditCard=new ReditCardService();


    public void ATMService() {
        int input;
        do {
            System.out.println("1.Add new atm card:");
            System.out.println("2.Display list atm card:");
            System.out.println("3.Search card :");
            System.out.println("4.Remove card :");
            System.out.println("5.Recharge card:");
            System.out.println("6.Return main menu :");
            System.out.print("Mời bạn nhập lựa chọn:");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    atmService.reGistration();
                    break;
                case 2:
                    atmService.disPlay();
                    break;
                case 3:
                    atmService.searchCard();
                    break;
                case 4:
                    atmService.reMove();
                    break;
                case 5:
                    atmService.reCharge();
                    break;
                case 6:
                    displayMainMenu();
                    return;
            }
        } while (input!=6);

    }

    public void ReditCardService() {
        int input;
        do {
            System.out.println("1.Add new reditcard card:");
            System.out.println("2.Display list redit card:");
            System.out.println("3.Search reditcard :");
            System.out.println("4.Remove reditcard :");
            System.out.println("5.Recharge reditcard:");
            System.out.println("6.Return main menu :");
            System.out.print("Mời bạn nhập lựa chọn:");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    reditCard.reGistration();
                    break;
                case 2:
                    reditCard.disPlay();
                    break;
                case 3:
                    reditCard.searchCard();
                    break;
                case 4:
                    reditCard.reMove();
                    break;
                case 5:
                    reditCard.reCharge();
                    break;
                case 6:
                    displayMainMenu();
                    return;
            }
        } while (input !=6);

    }

    public void displayMainMenu() {
        int input;
        do {
            System.out.println("1.ATMService");
            System.out.println("2.ReditCardService");
            System.out.println("3.Exit");
            System.out.print("Mời bạn nhập lựa chọn:");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    ATMService();
                    break;
                case 2:
                    ReditCardService();
                    break;
                case 3:
                    System.out.println("Thank you!!!");
                    break;
            }
        } while (input!=3);
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.displayMainMenu();
    }
}
