package Ifelse_and_Loop;

import java.util.Scanner;

public class User_Input_UntilQ {
    public void stopTakingInput(){
        int sum=0;
        char ch;
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("Input a number");
            sum+=input.nextInt();

            System.out.println("If you want to continue press y if not press q");
            ch=input.next().charAt(0);
        }
        while (ch!='q');

        System.out.println("Sum of the numbers= "+sum);
    }


    public static void main(String[] args) {
        User_Input_UntilQ user_input_untilQ = new User_Input_UntilQ();
        user_input_untilQ.stopTakingInput();
    }
}
