/*
Write a program that captures input from the user and swaps the letters two at a time in the string. 
The first two characters change places, the third and fourth characters change places, etc. 
If the string has an odd number of characters, the last character will remain as it is. 
Assume that the program will only take an even number of characters, otherwise, 
there will be an error.
*/
public class Exercise5 {
    public static void main(String args[]) {
      
      //String myString = args[0];
      String myString = "home";
      
      //add code below this line
      
      for (int i = 0; i < myString.length(); i++) {
    if (i % 2 == 0) {
      System.out.print(myString.charAt(i + 1));
    }
    else {
      System.out.print(myString.charAt(i - 1));
    }
  }
      
      //add code above this line
      
    }
  }
