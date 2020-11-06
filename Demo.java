import java.io.*;
// for File
import java.util.*;
// for Scanner
public class HoursDemo {

    public static void main (String [] args) throws FileNotFoundException {
        Scanner input = new Scanner (new File ("hours.txt"));
        while (input.hasNext()) {
            //while it is not end of file
            // process each person
            int id = input.nextInt();         
            String name = input.next();
            double totalHours = 0;
            int day =0;
            while (input.hasNextDouble()) {
                totalHours += input.nextDouble();
                day++;
            }         
        System.out.println (name + " (ID#"+id+") worked "+totalHours+" hours ( "+totalHours/day+ " hours/day)");
        }
    }
}
