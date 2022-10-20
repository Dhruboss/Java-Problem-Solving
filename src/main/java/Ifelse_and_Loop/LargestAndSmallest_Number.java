package Ifelse_and_Loop;

//10. Write a program to enter the numbers till the user wants and at the end,
// the program should display the largest and smallest numbers user entered.

import java.util.Scanner;

public class LargestAndSmallest_Number {
    public void userInputLargesSmallestNumber(){
        int max=0;
        int min=0;
        int sum=0;
        char ch;
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("Input a number");
            sum=input.nextInt();

            if (sum>max){
                max=sum;
            }
            if (sum<min){
                min=sum;
            }

            System.out.println("If you want to continue press y if not press q");
            ch=input.next().charAt(0);
        }
        while (ch!='q');

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }


    public static void main(String[] args) {
        LargestAndSmallest_Number largestAndSmallest_number = new LargestAndSmallest_Number();
        largestAndSmallest_number.userInputLargesSmallestNumber();
    }
}
