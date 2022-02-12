/*
Count the Vowels
You are going to write a program that counts the number of vowels that appear in a string. 
For the purpose of this exercise, vowels are upper and lowercase a, e, i, o, u.
*/

public class Lab4 {
    public static void main(String args[]) {
      
      //add code below this line
      String myString = "The Brown Dog Jumps Over The Lazy Fox";
      char ch;
      int count = 0;
      for (int i = 0; i < myString.length(); i++) {
        ch = myString.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || 
            ch == 'o' || ch == 'u' || ch == 'A' ||
            ch == 'E' || ch == 'I' || ch == 'O' ||
             ch == 'U') {
               count += 1;
             }
      }
  
      if (count == 0) {
          System.out.println("There are no vowels in the string.");
          }
      else if (count == 1) {
              System.out.println("There is 1 vowel in the string.");
          }
      else {
          System.out.println("There are " + count + " vowels in the string.");
        }
      
      //add code above this line
    }
  }