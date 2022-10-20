package org.FunctionAndArray;

import java.util.Scanner;

public class User_Login {

    public void login(String[] a){

//        String a="admin";
//        String p="123";
        int c=0;
        for (int i=0; i<3; i++){
            Scanner input =new Scanner (System.in);
            System.out.println("Enter any Username :");
            String username = input.nextLine();
            System.out.println("Enter any Password :");
            String password = input.nextLine();
            if ((a[0].equals(username)) && (a[1].equals(password))){
                System.out.println("logged in succesfully");
                break;
            } else if (c==2) {
                System.out.println("Your user has been temporary locked");
                break;
            }else {
                System.out.println("Wrong credentials please try again");
                c++;
            }
        }

    }
    public static void main(String[] args) {
            String[] a= {"admin","admin@123"} ;
            User_Login user_login = new User_Login();
            user_login.login(a);
    }
}
