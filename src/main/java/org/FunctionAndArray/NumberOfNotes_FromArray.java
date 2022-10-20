//2. Input an amount from the user and find out the number of notes from input amount in given array
//[1000,500,100,50,20,10,5,2,1]
//Input: 1256
//Output:
//1000 1
//100 2
//50 1
//2 3

package org.FunctionAndArray;

import java.util.Scanner;

public class NumberOfNotes_FromArray {
    public void notesArray(int b){
        int[] notes = new int[]{ 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
        int[] count = new int[9];

        for (int i = 0; i < 9; i++) {
            if (b >= notes[i]) {
                count[i] = b / notes[i];
                b = b % notes[i];
            }
        }

        for (int i = 0; i < 9; i++) {
            if (count[i] != 0) {
                System.out.println(notes[i] + " " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("Enter any Number :");
        int b = input.nextInt();

        NumberOfNotes_FromArray array2 = new NumberOfNotes_FromArray();
        array2.notesArray(b);

    }
}
