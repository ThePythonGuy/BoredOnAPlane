import java.util.*;
public class Bored1 {
    /*
     *  Lists all the primes up to and including the upper bound.
     */
    public static void main(String[]args){
        boolean isPrime;
        int newRowInd = 0;
        double breaker;
        Scanner scan = new Scanner(System.in);
        System.out.println("What number would you like to go up to I guess?");
        int n = scan.nextInt();
        if (n >= 2){
            System.out.print("2\t\t");
            newRowInd++;
        }
        for (int i = 3; i <= n; i+=2){
            isPrime = true;
            breaker = Math.sqrt((double)i);
            for (int j = 3; j <= breaker; j+=2){
                if ((double)i%(double)j==0){
                    isPrime = false;
                    breaker = j;
                }
            }
            if (isPrime){
                System.out.print(i + "\t\t");
                newRowInd++;
                if (newRowInd%10 == 0){
                    System.out.println();
                }
            }
        }
    }
}
