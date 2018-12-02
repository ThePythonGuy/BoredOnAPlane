import java.util.Scanner;
import java.text.DecimalFormat;

public class Bored4 {
    /*
     *  Takes in an integer value that serves as the upper limit of the denominators of the set of all coprime fractions
     *  where for every fraction f, 0 <= f <= 1. It then proceeds to output all of those fractions in ascending order,
     *  followed on the next line by the decimal equivalent of each, and at the end outputs the number of coprime
     *  fractions with a denominator less than the user input at the start.
     *
     *  An example where the user inputs 3:
     *
     *      What is the highest number you want in your denominator?
     *      3
     *      0/1
     *      0.0
     *
     *      1/3
     *      0.3333333333333333
     *
     *      1/2
     *      0.5
     *
     *      2/3
     *      0.6666666666666666
     *
     *      1/1
     *      1.0
     *
     *      There are 5 coprime fractions.
     */
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        double num = 0, den = 1;
        int maxDen, index = 0, coprimeChecker = 0, total = 0;
        boolean isCoprime = false;

        //This is the input portion, where the value given by the user is the maximum denominator
        System.out.println("What is the highest number you want in your denominator?");
        maxDen = scan.nextInt();
        double [] maxNums = new double[maxDen];
        for(int i = 1; i < maxNums.length; i++){
            maxNums[i] = 1;
        }
        maxNums[0] = 0;

        //This is the output portion which prints out each coprime fraction
        while (num / den < 1){
            num = maxNums[0];
            den = 1;
            for(int i = 0; i < maxDen; i++){
                if(maxNums[i] / (i + 1) < num / den){
                    num = maxNums[i];
                    den = i + 1;
                    index = i;
                }
            }

            //Prints out the coprime fraction in the form a/b and adds the decimal value on the next line
            System.out.println("" + df.format(num) + "/" + df.format(den) + "\n" + (num / den) + "\n");
            total++;

            //This portion checks to see if the value stored for the highest possible denominator is now coprime
            while(!isCoprime){
                maxNums[index] += 1;
                for(int i = 2; i <= index + 1; i++){
                    if((index + 1) % i == 0 && maxNums[index] % i == 0) {
                        coprimeChecker++;
                    }
                }
                if (coprimeChecker == 0){
                    isCoprime = true;
                }
                coprimeChecker = 0;
            }
            isCoprime = false;
        }
        System.out.println("There are " + total + " coprime fractions.");
    }
}
