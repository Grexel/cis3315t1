package part3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Write 100 random ints to a text file; one int per line. Use a try with
 * resources and a catch block as needed. Add a finally block that prints the
 * words "All done".
 *
 * @author Jeffrey Miller
 */
public class T1P3 {

    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        int numberOfRandomInts = 100;
        String fileName = "randomInts.txt";
        
        //try opening a file to fill with random ints.
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fileName)))){
            for(int i = 0; i < numberOfRandomInts; i++){
                bw.write(Integer.toString(rand.nextInt()));
                if(i != numberOfRandomInts - 1){
                    bw.write("\n");
                }
            }
        }catch(IOException ieo){
            System.out.println(ieo);
        }
        finally{
            System.out.println("All done");
        }
        
        /*
        //try reading a file with random ints
        try(Scanner sc = new Scanner(new File(fileName))){
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch(IOException ieo){
            System.out.println(ieo);
        }
        finally{
            System.out.println("All done");
        }
        */
    }
}
