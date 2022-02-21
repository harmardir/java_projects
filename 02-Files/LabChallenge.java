/* 
Write a program that reads the text file. This file is stored in the variable path. 
Do not alter this line of code. The file contains several instances of the word Burma. 
Replace each instance of Burma with Myanmar, and print the results of this transformation. 
The final output of your program should be:

Myanmar is a country in Southeast Asia.
The capital of Myanmar is Naypyidaw.
Its population is about 54 million people.
Myanmar is a former British colony.
*/


import java.io.*;
import java.util.ArrayList;

public class LabChallenge {
  public static void main(String args[]) {
    
    String path = args[0];
    //add code below this line
    
    ArrayList<String> text = new ArrayList<String>();
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      while (reader.ready()) {
        text.add(reader.readLine());
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.\n");
    }
    for (String line : text) {
      String replaceLine = line.replace("Burma", "Myanmar");
      System.out.println(replaceLine);
    }
    
    //add code above this line 
  }
}
