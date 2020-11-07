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
        Scanner input2 = new Scanner(new File("hours.txt"));
        //count for lines.
        int lineNumber = 0;
        System.out.print("Enter an ID: ");
        int str = scanner.nextInt();
                Main obj = new Main();
      //Calling the method
      String result = obj.findPerson(input,str);
      System.out.println(result);
        //process file line by line.
        while(input2.hasNextLine()){
            //read in each line
            String line = input2.nextLine();
            //process each line "tokenize"
            processLine(line);
            lineNumber++;
            
        }
        
        

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
     // This is where we search by id
     public static String findPerson(Scanner input, int searchId) {
        double Last = 0.0; //used to prevent reading in id.
        int identity = searchId;
        double totalHours = 0.0; 
        int count = 0;
        int day =0;
        //StringBuffer sb = new StringBuffer();
        while(input.hasNextLine()){
        if(input.hasNextInt()){
        if(input.nextInt() == identity){
            System.out.print(identity);
            
            String name = input.next();
            System.out.print(" " + name + " worked");
            //
             while (input.hasNextDouble()) {
            //System.out.println(input.nextDouble());
            Last = input.nextDouble();
            //System.out.println(Last);
            totalHours += Last;
            
            }
            totalHours = totalHours - Last;
            break;
            }
        }
        else{
            String move = input.next();

        }
        
     }



      //return sb.toString();
      String info = " " + totalHours + " hours (" + " hours/day)";
        return info;

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
         System.out.println("id "+ id+" day "+ day + " Total Hours "+ totalHours + " ");
     }
}
