//1. Take input from a user and check if the number exists in the array
//let the array is [1,3,5,7,2,4,6,8]
//Input: 7
//Output: Found in the position 3
//Input: 9
//Output: Found no element

package org.FunctionAndArray;

import java.util.Scanner;

public class Array_Number_Exist {
    public void existArray(int b){
        int a[]= {1,3,5,7,2,4,6,8};
        int c = 0;
        for(int i=0; i<a.length; i++) {
            if (a[i]==b) {
                System.out.println("Found in the position " + i);
                c=1;
                break;
            }
        }
        if (c==0){
            System.out.println("Found no element");
        }
            }

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("Enter any Number :");
        int b = input.nextInt();

        Array_Number_Exist array1 = new Array_Number_Exist();
        array1.existArray(b);
    }
}
