package Ifelse_and_Loop;

import java.util.Scanner;

public class GPA_And_Grade {
    public void calculateCgpaAndGrade(int marks){
        if (marks>=90 && marks<=100){
            System.out.println("A+");
        } else if (marks>=85 && marks<90) {
            System.out.println("A");
        } else if (marks>=80 && marks<85) {
            System.out.println("B+");
        } else if (marks>=75 && marks<80) {
            System.out.println("B");
        } else if (marks>=70 && marks<75) {
            System.out.println("C+");
        } else if (marks>=65 && marks<70) {
            System.out.println("C");
        } else if (marks>=60 && marks<65) {
            System.out.println("D+");
        } else if (marks>=50 && marks<60) {
            System.out.println("D");
        } else if (marks<50) {
            System.out.println("F");
        } else {
            System.out.println("Enter valid marks");
        }

    }
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("Enter any Number :");
        int marks = input.nextInt();

        GPA_And_Grade gpa_and_grade = new GPA_And_Grade();
        gpa_and_grade.calculateCgpaAndGrade(marks);
    }
}
