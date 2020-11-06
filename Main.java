import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;// List
import java.io.FileWriter;   // Import the FileWriter class
import java.util.Random;// random numbers
import java.io.IOException; // Handle exceptions
import java.util.*;
import java.util.List; // lists
import java.util.Arrays;// arrays

import java.io.*;
// for File
import java.util.*;

public class Main{

    

    public static void main (String [] args) throws FileNotFoundException {
        //read string
        Scanner scanner = new Scanner (System.in);
        //read file
        Scanner input = new Scanner(new File("hours.txt"));
        //count for lines.
        int lineNumber = 0;
        
        //process file line by line.
        while(input.hasNextLine()){
            //read in each line
            String line = input.nextLine();
            //process each line "tokenize"
            processLine(line);
            lineNumber++;
            
        }
        
        System.out.println("Enter an ID.");
        String str = scanner.nextLine();
        /*char[] cArr =  str.toCharArray();
        //for each in string
        for(int i = 0; i< str.length(); i++){
       // do somthing for each inputed value
            System.out.println(cArr[i]);
        }
        //for each in array
        for(int j = 0; j< cArr.length; j++){
        // do somthing for each inputed value
            System.out.println(cArr[j]);
        } */
      
     }
     public static String findPerson(Scanner input, int searchId) {
     return "";
     }
    
     public static void processLine(String line) {
        //process the line
        Scanner lineScan = new Scanner(line);
         int count = 0;
         int id = lineScan.nextInt();
         String name = lineScan.next();
         double totalHours = 0;
         int day =0;
         while (lineScan.hasNextDouble()) {
            totalHours += lineScan.nextDouble();
             
             // consume the input
             day++;
             //no longer needed.
             count++;
             
         }
         //print out tokens in each line
         System.out.print("day "+ day + " Total Hours "+ totalHours + " ");
     }
}
