package org.example;

public class ATM {
    public void deposit(int amount){
        System.out.println("Deposited cash: $" + amount);

    }
    public void deposit(String checkNumber,int amount){
        System.out.println("Deposited check # " +checkNumber+ " amount: $"+amount);

    }

}
