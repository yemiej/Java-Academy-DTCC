package assignment_3.item_package;

import java.util.ArrayList;
import java.util.List;

public class driver {
    public static void main (String args []) {
        /*
            This can be where you attempt to test constructing your objects!
            Additionally, you can create a main method in your item class if you so choose.
         */

        // Example construction of root class Object
        Object o = new Object();

        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Book", Item.ItemType.Knowledge, 12.05, "Personal Hygiene"));
        itemList.add(new Item("Chicken", Item.ItemType.Food, 21.15, "Fried Chicken"));
        itemList.add(new Item("Vanilla", Item.ItemType.Food, 12.39, "Ice Cream"));
        itemList.add(new Item("Knife", Item.ItemType.Weapon, 70.00, "Pocket Knife"));
        itemList.add(new Item("Extinguisher", Item.ItemType.Safety, 120.00, "Fire Extinguisher"));
        itemList.add(new Item("Sketchers", Item.ItemType.Footwear, 250.99, "Running Shoe"));

        System.out.println("    List of Items ");
        System.out.println("*****************************" );
        for(Item item : itemList) {
            System.out.println(item);
        }
    }
}
