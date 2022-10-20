package Ifelse_and_Loop;

import java.util.Scanner;

public class SmallorCapital_Letter {
    public void checkSmalOrCapital(char letter){

        if(letter>='a' && letter <='z'){
            System.out.println("Small letter");
        } else if (letter>='A' && letter <='Z') {
            System.out.println("Capital letter");
        }else {
            System.out.println("input valid letter");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Letter :");
        char letter = sc.next().charAt(0);
        SmallorCapital_Letter smallorCapital_letter = new SmallorCapital_Letter();
        smallorCapital_letter.checkSmalOrCapital(letter);
    }
}
