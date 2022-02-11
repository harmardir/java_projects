/*
Reverse a String
You are going to write a program that takes a string and prints it in reverse order.
*/

public class Lab2 {
    public static void main(String args[]) {
      
      //add code below this line
      String myString = "The brown dog jumps over the lazy fox";
      String reversedString = "";
  
      int index = myString.length() - 1;
  
      while (index >= 0){
        reversedString += myString.charAt(index);
        index -= 1;
      }
  
      System.out.println(reversedString);
      //add code above this line
    }
  }