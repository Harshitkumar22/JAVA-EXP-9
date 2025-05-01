import java.util.ArrayList;
import java.util.HashSet;

public class UniqueSum{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();  // Array list of dublicates
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(5);

        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);  // Convert to HashSet to remove duplicates

        int sum = 0;     // Calculating the sum of unique values
        for(int num : uniqueNumbers){
            sum += num;
        }

        System.out.println("Unique values: " + uniqueNumbers);
        System.out.println("Sum of unique values: " + sum);
    }
}