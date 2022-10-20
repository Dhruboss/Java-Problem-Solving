package Ifelse_and_Loop;

import java.util.Scanner;

public class Check_Decimal_Nmubers {
    public void checkSameOrDifferent(double a, double b){
        if (a-b==0){
            System.out.println("Same");
        }else {
            System.out.println("Different");
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter decimal number");
        double a = input.nextDouble();
        System.out.println("Enter decimal number");
        double b = input.nextDouble();

        Check_Decimal_Nmubers check_decimal_nmubers = new Check_Decimal_Nmubers();
        check_decimal_nmubers.checkSameOrDifferent(a,b);
    }
}
