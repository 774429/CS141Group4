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
public static String search = "y";
public static String x = "y";
    public static void main (String [] args) throws FileNotFoundException {
        
        

        
        //read file for processLine method.
        Scanner input2 = new Scanner(new File("hours.txt"));
    
        
    
        
        //read string
        Scanner scanner2 = new Scanner (System.in);
        int str;
        //count for lines.
        int lineNumber = 0;
        //
        // loop this
        //
        // new object called main so I can pass scanner as arg.

        Main obj = new Main();
        Scanner scanner = new Scanner (System.in);
         
        //read file from begining for search "linear algorithm".
         while(x.equals("y")==true || x.equals("yes")==true){
            Scanner input = new Scanner(new File("hours.txt"));

            str = 0;
            System.out.print("Enter an ID: ");
       // try{
            //get id catch not a int
            str = scanner.nextInt();
            // new object called main so I can pass scanner as arg.
            
            //Calling the method in object main and returning String for search
            String result = obj.findPerson(input,str);
            System.out.println(result);


       // }
        //catch(Exception e){
         //   System.out.println("ID is not valid");
        //}
            
            System.out.println("search again y/n ");
            x = scanner2.next();
           if(x.equals("y")== true || x.equals("yes")==true){
           
            }
           else{
           System.out.println(x);
           break;
           }
        }

        //
        //loop end
        //
        //process file line by line.
        /*
        while(input2.hasNextLine()){
            //read in each line
            String line = input2.nextLine();
            //process each line "tokenize"
            processLine(line);
            lineNumber++;
            
        }*/
        System.out.print("Have a Nice Day");        
        


      
     }
     // This is where we search by id
     //A method to find person information and return the line of data for the person
     public static String findPerson(Scanner input, int searchId) {

        double Last = 0.0; //used to prevent reading in id.
        int identity = searchId;
        double totalHours = 0.0; 
        int count = 0;
        String info = "ID is not valid";
        int day =0;
        String name = "";
        //StringBuffer sb = new StringBuffer();
        while(input.hasNextLine()){
            if(input.hasNextInt()){
                if(input.nextInt() == identity && input.hasNextDouble() == false){
                    //System.out.print(identity);
            
                    name = input.next();
                    name = (" " + name + " worked ");
            //
                    while (input.hasNextDouble()) {
                        
                        Last = input.nextDouble();
                        
                        //System.out.println(Last);
                        if(input.hasNextDouble() == true){
                        totalHours += Last;
                        //System.out.println(Last);
                        }
                        count++;
                    }
                    totalHours = totalHours;// - Last;
                    count--;
                    break;
                }
            }
            else{
                String move = input.next();
            }
        }
        if(name == ""){
            info = "ID is not valid";
        }
        else{
        //return sb.toString();
        //identity +
        info =  name + totalHours + " hours (" + totalHours/count + " hours/day)";
        }
        return info;
     }
    //A method to calculate the total hours worked by the person and outputs their info
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
         System.out.println("id "+ id+" worked "+ day + " days," +" Total Hours "+ totalHours + " ");

     }
}
