/*
 * account.java
 * Hunter Quantz
 * 
 * This class hold the information of a checking account
 */
package savingsaccount;

public class account {

    private double balance = 0.0; //stores the current balance of the checking account
    private double interestRate; //stores the interest rate
    
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate / 100.0;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void growAccount(int cycles){
        for (int i = 0; i < cycles; i++){
        this.balance += (this.interestRate * this.balance);
    }
    }
}
