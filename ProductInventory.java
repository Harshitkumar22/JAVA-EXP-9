import java.util.HashMap;
import java.util.Map;

public class ProductInventory{
    public static void main(String[] args){
        // Creating a HashMap to store productId as key and quantity as value
        HashMap<Integer, Integer> inventory = new HashMap<>();

        // Adding 3 products
        inventory.put(101, 50);  // productId 101, quantity 50
        inventory.put(102, 30);  
        inventory.put(103, 20);  

        inventory.put(102, 45); // Updating quantity of productId 102

        inventory.remove(101);  // Removing product with productId 101

        System.out.println("Final Inventory:");   // Displaying final inventory
        for(Map.Entry<Integer, Integer> entry : inventory.entrySet()){
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}