package Ifelse_and_Loop;

//4. Write a program to check balance and withdraw money from ATM booth using if else or switch case

import java.util.Scanner;

public class ATM_Balance_Withdraw {
    public void CheckBalanceAndWithdraw(int withdraw, int balance){
        if(withdraw<balance){
            int newbalance= balance-withdraw;
            System.out.println("withdraw amount: "+withdraw+"tk");
            System.out.println("New balance is : "+newbalance+"tk");
        } else if (withdraw>balance) {
            System.out.println("Insufficient balance");

        }
    }
    public static void main(String[] args) {
        int balance= 10000;
        System.out.println("Your current balace is: "+balance+"tk");
        Scanner input =new Scanner (System.in);
        System.out.println("Enter withdraw amount :");
        int withdraw = input.nextInt();

        ATM_Balance_Withdraw atm_balance_withdraw = new ATM_Balance_Withdraw();
        atm_balance_withdraw.CheckBalanceAndWithdraw(withdraw,balance);
    }
}
