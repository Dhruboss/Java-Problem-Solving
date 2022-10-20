package Ifelse_and_Loop;

//5. Write a program to sum of numbers which only divisible by 5 from 1 to 100

import java.util.Scanner;

public class SumOf_Divisionby5 {
    int sum=0;
    public void SumNumber(){
        for (int i=1 ; i<=100 ; i++){
            if (i%5==0){
                sum+=i;
            }
        }
        System.out.println("Sum : "+sum);
    }
    public static void main(String[] args) {
        SumOf_Divisionby5 sumOf_divisionby5 = new SumOf_Divisionby5();
        sumOf_divisionby5.SumNumber();
    }
}
