package Ifelse_and_Loop;

//6. Write  a program to find the factorial of a given number

import java.util.Scanner;

public class Factorial_Number {
    int sum = 1;
    public void findFactorial(int f){
        for (int i = f ; i>0 ; i--){
            sum= sum*i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("Enter any Number :");
        int f = input.nextInt();

        Factorial_Number factorial_number = new Factorial_Number();
        factorial_number.findFactorial(f);
    }
}
