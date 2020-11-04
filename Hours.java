
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
        Scanner scanner = new Scanner (System.in);
        System.out.println("hi");
        String str = scanner.nextLine();
        char[] cArr =  str.toCharArray();
        for(int i = 0; i< str.length(); i++){
       // do somthing for each inputed value
            System.out.println(cArr[i]);
        }

      
   }

}
