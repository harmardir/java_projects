/* 
Write a program that takes input from a user and prints the first character of the input 
and the last character with some context. 
For example, if baseball is the string, then the program will output b is the first character
 and l is the last character. 
 If cat is the string, then c is the first character and t is the last character will be printed.
 */

public class Exercise1 {
    public static void main(String args[]) {
      
      //String myString = args[0];
      String myString = "Hello World";
      
      //add code below this line
      char first = myString.charAt(0);
      char last = myString.charAt(myString.length() - 1);
      System.out.println(first + " is the first character and " + last + " is the last character");
  
      
      //add code above this line
    }
  }
