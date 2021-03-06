package part1;

import java.util.Random;

/**
 * Fill this 20 x 20 int array with random numbers. The numbers should have
 * values between 0 and 99. Then use a nested loop to print out the array row by
 * row with the numbers in evenly spaced columns.
 *
 * @author Jeffrey Miller
 */
public class T1P1 {

    public static void main(String[] args) {
        Random gen = new Random();
        int[][] a = new int[20][20];

        // Code to fill array with random ints
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = gen.nextInt(100);
            }
        }
        // Code to print array row by row
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(String.format("%4d",a[i][j]));
            }
            System.out.println("");
        }
    }
}
