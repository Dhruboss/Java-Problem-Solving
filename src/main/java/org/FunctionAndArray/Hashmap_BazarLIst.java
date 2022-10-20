package org.FunctionAndArray;

//4. Create your todays bazar list/pocket expenditure which includes the item name and price.
// Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price. If found no item,
// then print message as "No item found" and another function named totalSum() which will return total price of items.

import java.util.HashMap;

public class Hashmap_BazarLIst {
    public void searchitem(){

    }
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        hashMap.put("Alu","60");
        hashMap.put("Chini","80");
        hashMap.put("Chal","100");
        hashMap.put("Tel","200");
        hashMap.put("Kola","110");

        Hashmap_BazarLIst hashmap1= new Hashmap_BazarLIst();
        hashmap1.searchitem();

    }
}
