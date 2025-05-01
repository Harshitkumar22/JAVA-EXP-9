import java.util.ArrayList;

public class PrimeCheck{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        for(Integer num : numbers){   // Check each number if it's prime
            int n = num;              // unboxing
            boolean isPrime = true;   // initially

            if(n <= 1){
                isPrime = false;
            } else{                   // This loop checks if n is divisible by any number from 2 to n-1.
                for (int i = 2; i < n; i++){
                    if (n % i == 0){
                        isPrime = false;
                        break;
                    }
                }
            }

            if(isPrime){
                System.out.println(n + " is a prime number.");
            } else{
                System.out.println(n + " is not a prime number.");
            }
        }
    }
}