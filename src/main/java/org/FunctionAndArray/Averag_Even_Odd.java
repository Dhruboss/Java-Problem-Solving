//5. Take 5 numbers from users in an array.
// Then find out the average number,
// how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers()

package org.FunctionAndArray;

public class Averag_Even_Odd {
    public void average(int[] a){
        float b=0;
        for (int i=0; i<a.length; i++){
            b=b+a[i];
        }
        float c= b/a.length;
        System.out.println("Average: "+c);
    }
    public void countEvenNumbers(int[] a){
        int even=0;
        for (int i=0; i<a.length; i++){
            if(a[i]%2==0){
                even++;
            }
        }
        System.out.println("There are "+even+" nummbers");
    }
    public void countOddNumbers(int[] a){
        int odd=0;
        for (int i=0; i<a.length; i++){
            if(a[i]%2!=0){
                odd++;
            }
        }
        System.out.println("There are "+odd+" nummbers");
    }
    public static void main(String[] args) {
        int a[]={5,4,8,11,1,10,1};
        Averag_Even_Odd array5=new Averag_Even_Odd();
        array5.average(a);
        array5.countEvenNumbers(a);
        array5.countOddNumbers(a);

    }
}
