package Ifelse_and_Loop;

//7. Write a program to print prime numbers from 2 to n

import java.util.Scanner;

public class PrimeNumber_2toN {
    public void printPrimeNumber(int n){

    }
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("Enter any Number :");
        int n = input.nextInt();

        PrimeNumber_2toN primeNumber_2toN = new PrimeNumber_2toN();
        primeNumber_2toN.printPrimeNumber(n);

    }
}
