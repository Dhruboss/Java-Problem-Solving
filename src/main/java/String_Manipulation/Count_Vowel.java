package String_Manipulation;

//5. Write a program that will count how many vowels in the given string:
//"roadtosdet"
//Output: 4

public class Count_Vowel {
    public void countVowel(String str){
        {
            int c = 0;
            char []ch= str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                    c++;
                }
            }
            System.out.println("Total no of vowels in string are: " + c);
        }
    }
    public static void main(String[] args) {
        String str = "roadtosdet";
        Count_Vowel count_vowel = new Count_Vowel();
        count_vowel.countVowel(str);

    }
}
