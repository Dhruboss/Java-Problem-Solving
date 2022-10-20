package String_Manipulation;

//Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee,
// then 400 tk will be discounted. After your purchase what will be your total cost?

import javax.swing.plaf.PanelUI;

public class TotalCost_Of_Shirt {
    public void getTotalCost(String s){
        s = s.replaceAll("[^\\d]"," ");
        s = s.trim();
        s = s.replaceAll(" +"," ");
        String[] arr= s.split(" ");
        double shirt= Double.parseDouble(arr[0]);
        double sharee= Double.parseDouble(arr[1]);
        double discount= Double.parseDouble(arr[4]);

        double totalCost = ((shirt*2)+sharee)-discount;
        //double shirPrice= Double.parseDouble(arr[0]);
        System.out.println("Total Cost: "+totalCost);
       // System.out.println(s);
    }
    public static void main(String[] args) {
        String s ="Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee," +
                " then 400 tk will be discounted. After your purchase what will be your total cost?";
        TotalCost_Of_Shirt totalCost_of_shirt = new TotalCost_Of_Shirt();
        totalCost_of_shirt.getTotalCost(s);
    }
}
