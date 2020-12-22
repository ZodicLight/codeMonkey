package com.eyepoppy;

public class Account {
    private float balance;

    public void deposit(float amount){
        //this.balance = this.balance + amount;
        //this.balance += amount;
        if(amount > 0)
            balance += amount;
    }

    public void withdraw(float amount){
        if(amount > 0)
            balance -= amount;
    }

//    public void setBalance(float balance){//setter a method to change the value
//        if(balance > 0)
//            this.balance = balance;
//    }

    public float getBalance(){
        return balance;
    }
}
