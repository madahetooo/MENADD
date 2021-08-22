package com.company.gdgmena;

import java.util.Scanner;

public class ATM {
    String userName;
    float Balance;
    float Money;
    public void setCardInformation(){
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
        System.out.println("Please enter your Balance");
        Scanner scanner2 = new Scanner(System.in);
        Balance = scanner2.nextFloat();
    }
    public void getCardInformation(){
        System.out.println("Welcome " + userName);
        System.out.println("Your Balance is : " + Balance);
    }
    public void depositMoney(){
        System.out.println("How much you want to deposit");
        Scanner scanner3 = new Scanner(System.in);
        Money = scanner3.nextFloat();
        Balance = Balance + Money;
        checkBalance();
    }
    public void checkBalance(){
        System.out.println("You have " + Balance);
    }
    public void withdrawMoney(){
        System.out.println("How much you want to withdraw");
        Scanner scanner4 = new Scanner(System.in);
        Money = scanner4.nextFloat();
        Balance = Balance - Money;
        checkBalance();
    }
    public ATM(){
        System.out.println("Constructor has been intialized");

    }
    public  ATM(int balance){
    }
}
