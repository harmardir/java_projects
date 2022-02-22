/*
Write a program that reads a comma delimited CSV file with four columns and returns 
the average of each column in the file.
*/

import java.io.*;
import com.opencsv.*;
import org.apache.commons.lang3.ObjectUtils;

public class Exercise2 {
  public static void main(String args[]) {
    
    String path = args[0];
    //add code below this line
    try {
      CSVReader reader = new CSVReader(new FileReader(path));
      double column0 = 0.0;
      double column1 = 0.0;
      double column2 = 0.0;
      double column3 = 0.0;
      int rows = 0;
      
      for (String[] row : reader) {
        rows++;
        for (int i = 0; i < 4; i++) {
          if (i == 0) {
            column0 += Float.parseFloat(row[i]);
          } else if (i == 1) {
            column1 += Float.parseFloat(row[i]);
          } else if (i == 2) {
            column2 += Float.parseFloat(row[i]);
          } else if (i == 3) {
            column3 += Float.parseFloat(row[i]);
          }
        }
      }
      System.out.print(String.valueOf(column0/rows) + " ");
      System.out.print(String.valueOf(column1/rows) + " ");
      System.out.print(String.valueOf(column2/rows) + " ");
      System.out.println(column3/rows);
      
      reader.close();
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a CSV");
    }    
    //add code above this line 
  }
}


