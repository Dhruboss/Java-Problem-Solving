package String_Manipulation;

//8. Write a program to convert each 1st char to uppercase from a string
//Input: rahim lives in sylhet
//Output: Rahim Lives in Sylhet

public class FirstChar_To_Uppercrease {
    public  void charUppercrease(String s){
        String[] w=s.split(" ");
        for(int i=0;i<w.length;i++){
            String firstLetter= String.valueOf(w[i].charAt(0)).toUpperCase();
            String othersLetter=w[i].substring(1);
            System.out.println(firstLetter+othersLetter);
        }
    }

    public static void main(String[] args) {
        String s= "rahim lives in sylhet";

        FirstChar_To_Uppercrease firstChar_to_uppercrease = new FirstChar_To_Uppercrease();
        firstChar_to_uppercrease.charUppercrease(s);

    }
}
