package String_Manipulation;

//3.Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?

public class Laptop_Purchase_Price {
    public void getPurchasePrice(String s){
        s = s.replaceAll("[^\\d]"," ");
        s = s.trim();
        s = s.replaceAll(" +"," ");
        String[] arr= s.split(" ");
        double laptopPrice= Double.parseDouble(arr[1]);
        double discount= Double.parseDouble(arr[2]);
        double discountedPrice= laptopPrice*(discount/100);
        double purchasePrice = laptopPrice-discountedPrice;
        System.out.println(purchasePrice);
    }
    public static void main(String[] args) {
        String s ="Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?";
        Laptop_Purchase_Price laptop_purchase_price = new Laptop_Purchase_Price();
        laptop_purchase_price.getPurchasePrice(s);
    }
}
