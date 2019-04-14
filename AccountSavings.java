/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bijay
 */
public class AccountSavings {

    /**
     * @param args the command line arguments
     */
    
    double annual_interest_rate;
    double saving_balance;
    
    public static void main(String[] args) {
        // TODO code application logic here
        AccountSavings saving = new AccountSavings();
        Thread t1,t2;
        t1 = new Thread(){
            @Override
            public void run(){
                double saving_balance_int1=0;
                for(int i=1;i<13;i++){
                    double saving_balance_int=0;
                    saving_balance_int = saving.monthly_interest();
                    saving_balance_int1 += saving_balance_int;
                    }
                System.out.println("total balance from thread 1 "+(saving.saving_balance+saving_balance_int1));
                try {
                    sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AccountSavings.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };
        t2 = new Thread(){
            @Override
            public void run(){
                double saving_balance_int1=0;
                for(int i=1;i<13;i++){
                    double saving_balance_int=0;
                    saving_balance_int = saving.monthly_interest();
                    saving_balance_int1 += saving_balance_int;
                    }
                System.out.println("total balance from thread 2 "+(saving.saving_balance+saving_balance_int1));


            }
        };
        t1.start();
        t2.start();
                }

    public AccountSavings() {
        this.saving_balance = 100;
        this.annual_interest_rate = 5.3;
    }
    
    public double monthly_interest(){
        double interest;
        interest = (annual_interest_rate * saving_balance)/1200;
        return interest;
    }
    
    
    
}
