/*
Counting Uppercase and Lowercase Characters
You are going to write a program that takes a string and prints out two messages. 
One message tells you how many uppercase characters are in the string. 
The other message tells how many lowercase characters are in the string. 
The program will ignore all numbers and special characters (punctuation, symbols, etc.).
*/

public class Lab1 {
  public static void main(String args[]) {
    
    //add code below this line
    int lowerCount = 0;
    int upperCount = 0;
    char ch;
    String myString = "Roses are Red, Violets are Blue";
    for (int i = 0; i < myString.length(); i++) {
          ch = myString.charAt(i);
          if (Character.isLowerCase(ch)) {
            lowerCount += 1;
            }
    else if (Character.isUpperCase(ch)) {
        upperCount += 1;
            }
          
        }

System.out.println("There are " + lowerCount + " lowercase characters.");
System.out.println("There are " + upperCount + " uppercase characters.");  
    //add code above this line
  }
}