import java.util.Scanner;

public class Bored2 {
    /*
     * Lists the gaps between primes of all primes up to and including an upper bound. Also lists the largest gap.
     */
    public static void main(String[]args){
        boolean isPrime;
        int newRowInd = 1;
        int biggestGap = 0;
        int floorGap = 0;
        int oldVal = 2;
        double breaker;
        Scanner scan = new Scanner(System.in);
        System.out.println("What number would you like to go up to I guess?");
        int n = scan.nextInt();
        if (n >= 2){
            System.out.print("2\t\t");
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
                System.out.print((i - oldVal) + "\t\t");
                if (i - oldVal > biggestGap){
                    biggestGap = i - oldVal;
                    floorGap = oldVal;
                }
                oldVal = i;
                newRowInd++;
                if (newRowInd%10 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("The biggest gap was " + biggestGap + " between " + floorGap + " and " + (floorGap + biggestGap) + ".");
    }
}
