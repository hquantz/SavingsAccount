/*
 * SavingsAccount.java
 * Hunter Quantz
 * 
 * This program runs the checking account program found in account.java
 */
package savingsaccount;

import java.util.Scanner;

public class SavingsAccount {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Account savingsAccount = new Account();
        
        int cycles;
        double interestRate;
        double balance;
        
        System.out.println("Ch 6 Account by Hunter Quantz\n");
        
        //get the needed data
        System.out.print("Enter starting balance of this Savings Account: ");
        balance = stdIn.nextDouble();
        System.out.println("Interest rate: to enter 2.5%, type 2.5");
        System.out.print("Please enter the interest rate for this account: ");
        interestRate = stdIn.nextDouble();
        System.out.print("Enter the number of cycles to grow this Savings Account: ");
        cycles = stdIn.nextInt();
        
        //set those values in the account object
        savingsAccount.setInterestRate(interestRate);
        savingsAccount.setBalance(balance);
        
        //now grow that account
        savingsAccount.growAccount(cycles);
        System.out.printf("After %d cycles, the account is worth $%-,10.2f\n", cycles, savingsAccount.getBalance());
    }//end main
    
}//end SavingsAccount class
