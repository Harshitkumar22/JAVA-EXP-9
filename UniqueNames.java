import java.util.HashSet;

public class UniqueNames{
    public static void main(String[] args) {
        String[] names = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};

        HashSet<String> uniqueNames = new HashSet<>();    // Storing names in a HashSet to remove duplicates
        for(String name : names){
            uniqueNames.add(name);
        }

        String checkName = "Sourabh";
        if(uniqueNames.contains(checkName)){
            System.out.println(checkName + " is present in the set.");
        } else{
            System.out.println(checkName + " is not present in the set.");
        }

        System.out.println("Unique names in the set:");   // Printing all unique names
        for(String name : uniqueNames){
            System.out.println(name);
        }
    }
}