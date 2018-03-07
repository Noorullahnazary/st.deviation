package com.company;
import javax.swing.*;

import static com.company.ProjConstants.*;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
	// write your code here
        String userInput = "";
        System.out.println("Please type in something to display");
        int someInteger= 0;
        StDeviation calcSDev =  new StDeviation();
        int itemCount;
        double average;
        double total;
        userInput = JOptionPane.showInputDialog("Enter name of file here");
        System.out.println("The user input: " + userInput);
        try {
            itemCount = 0;
            average = 0;
            total = 0;

            File userFile = new File(userInput+".txt");
            Scanner scanUserFile = new Scanner(userFile);


            // ---------------------------------------------
            // Reads in values from the file in a for loop
            //

            for(int i=0; i < MAXDATA; i++) {

                // ---------------------------------------------
                // The scanner checks if there is another integer and prints it
                // if there is
                //

                if (scanUserFile.hasNext()) {
                     calcSDev.addNewDataItem(scanUserFile.nextInt());



                }
                else {
                    // ---------------------------------------------
                    // The scanner detected no other integers
                    // - closes the scanner for the file
                    // - breaks out of the for loop
                    //
                    System.out.print("\n\nDataFileFILE has been completely READ");
                    scanUserFile.close();

                    // A break statement allows us to exit the loop before we have reach the end
                    break;
                }
            }


            average = total / someInteger;

            // ---------------------------------------------
            // By using the print statements you can make your output look "neat"
            //

            System.out.println("==================================================================\n");
            System.out.println("                       The Average\n");
            System.out.printf("\tNumber of Items........ %20.0f\n", (double)itemCount);
            System.out.printf("\tSum of all Items:...... %20.0f\n", total);
            System.out.printf("\tAverage:............... %20.4f\n\n", average);
            System.out.println("==================================================================\n");

            // ---------------------------------------------
            // If the file cannot be found then an exception (error) is generated (thrown) that we have to
            // deal with (catch).
            // - we print "e" the exception, and
            // - show the user where it was using the "exceptions" stack trace information
            //





    }
     catch (FileNotFoundException e) {
        System.out.println(e);
        e.printStackTrace();
    }


    }
}
