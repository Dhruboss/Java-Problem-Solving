//3. Suppose, in a company , here are some employee salaries in an array
//[35000, 25000, 28000, 32500, 44000, 32800]
//Find out the 3rd highest salary

package org.FunctionAndArray;

public class Third_Highest_Salary {
    public void thirdHighest(int[] a){
        //Arrays.sort(a,Collections.reverseOrder());
        int b=0;
        for (int i=0 ; i<a.length ; i++){
            for (int j = i+1; j < a.length; j++){
                if(a[i]<a[j]){
                    b=a[i];
                    a[i]=a[j];
                    a[j]=b;
                }
            }
        }
        System.out.println("Third highest salary is :"+a[2]);

    }
    public static void main(String[] args) {
        int a[]= {35000, 25000, 28000, 32500, 44000, 32800};

        Third_Highest_Salary array3 = new Third_Highest_Salary();
        array3.thirdHighest(a);
    }


}
