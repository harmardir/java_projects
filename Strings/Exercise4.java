/*
Write a program that takes input without white spaces from a user, 
prints the first half of the string on one line, and the second half on another. 
In the case of a string that has an odd number of characters, 
the second line will have the extra character.
*/

public class Exercise4 {
    public static void main(String args[]) {
      
      String myString = args[0];
      
      //add code below this line
      int num = myString.length();
      
        System.out.println(myString.substring(0, num /2));
        System.out.println(myString.substring(num /2, num));
      
  
      
      //add code above this line
    }
  }