package org.FunctionAndArray;

//7. Generate 20 random numbers from 0 to 100 and print the max, min and duplicate random numbers (if any)

public class Random_Number_minmax {
    public void randomMinMaxDup(int max, int min){
        int[] myArray = new int[20];
        for (int i=0 ; i<20 ; i++){
            double rand = Math.random()*(max-min+1)+min;
            int randnumb= (int)Math.floor(rand);
            System.out.println(randnumb);
            myArray[i]= randnumb;
        }
        int maximum=myArray[0];
        for (int j=0; j<myArray.length ; j++){
            if (myArray[j]>=maximum){
                maximum= myArray[j];
            }
        }
        System.out.println("Maximum number is: "+maximum);

        int minimum=myArray[0];
        for (int k=0; k<myArray.length ; k++){
            if (myArray[k]<=minimum){
                minimum= myArray[k];
            }
        }
        System.out.println("minimum number is: "+minimum);

        for (int i=0 ; i<myArray.length ; i++){
            for (int j=i+1; j<myArray.length ; j++){
                if (myArray[i]==myArray[j]){
                    System.out.println("found duplicate for "+myArray[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int max = 100;
        int min =0;
        Random_Number_minmax random_number_minmax = new Random_Number_minmax();
        random_number_minmax.randomMinMaxDup(max,min);
    }
}
