import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;// List
import java.io.FileWriter;   // Import the FileWriter class
import java.util.Random;// random numbers
import java.io.IOException; // Handle exceptions
import java.util.*;
import java.util.List; // lists
import java.util.Arrays;// arrays

public class Hours{

    

    public static void main (String[]  args){
        //read string
        Scanner scanner = new Scanner (System.in);
        //read file
       // Scanner input = new Scanner(new File ("Data.txt"));
        System.out.println("hi");
        String str = scanner.nextLine();
        char[] cArr =  str.toCharArray();
        //for each in string
        for(int i = 0; i< str.length(); i++){
       // do somthing for each inputed value
            System.out.println(cArr[i]);
        }
        //for each in array
        for(int j = 0; j< cArr.length; j++){
        // do somthing for each inputed value
            System.out.println(cArr[j]);
        } 
      
     }
     public static String findPerson(Scanner input, int searchId) {}
     public static void processLine(String line) {}
}
