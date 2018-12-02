import java.util.Scanner;
public class Bored3 {
    /*
     *  Runs the Collatz Conjecture for numbers between and including input bounds and lists the steps and number of
     *  steps.
     *
     *  Example with bounds of 1 and 4:
     *
     *      Lower bound?
     *      1
     *      Upper bound?
     *      4
     *      1    0 //took 0 steps to get to 1 because initial value is 1
     *      2 1    1
     *      3 10 5 16 8 4 2 1    7
     *      4 2 1    2
     */
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int x;
        int it;
        System.out.println("Lower bound?");
        int lb = scan.nextInt();
        System.out.println("Upper bound?");
        int ub = scan.nextInt();
        for(int i = lb; i <= ub; i++){
            x = i;
            it = 0;
            while(x != 1){
                System.out.print(x + " ");
                if(x%2 == 0){
                    x /= 2;
                }else{
                    x = 3 * x + 1;
                }
                it++;
            }
            System.out.print(1 + "    " + it);
            System.out.println();
        }
    }
}
