package String_Manipulation;

//4. Writea program that will give following output:
//Input: chattogram
//Output: C8M

import java.util.Locale;

public class Chattogram_to_C8M {
    public void getOutput(String s) {
        String s1 = String.valueOf(s.charAt(0)).toUpperCase();
        String s2 = String.valueOf(s.length() - 2);
        String s3 = String.valueOf(s.charAt(s.length() - 1)).toUpperCase();
        System.out.println(s1 + s2 + s3);
    }

    public static void main(String[] args) {
        String s= "chattogram";
        Chattogram_to_C8M chattogram_to_c8M= new Chattogram_to_C8M();
        chattogram_to_c8M.getOutput(s);
    }
}
