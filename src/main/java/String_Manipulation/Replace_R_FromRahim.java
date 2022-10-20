package String_Manipulation;

//6. Replace "R" from Rahim with "F" from the given String:
//Input: Ratul and Rahim lives in Rangpur
//Output: Ratul and Fahim lives in Rangpur

public class Replace_R_FromRahim {
    public void replaceString(String s){

        String s1 = s.replace( "Rahim","Fahim");
        System.out.println(s1);

    }
    public static void main(String[] args) {
        String s="Ratul and Rahim lives in Rangpur";

        Replace_R_FromRahim replace_r_fromRahim = new Replace_R_FromRahim();
        replace_r_fromRahim.replaceString(s);
    }
}
