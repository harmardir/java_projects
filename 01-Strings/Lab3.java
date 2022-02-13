/*
Swapping the Case of Characters
You are going to write a program that takes a string and prints a new string
 where all of the uppercase letters become lowercase, and the lowercase letters become uppercase.
*/


public class Lab3 {
    public static void main(String args[]) {
      
      //add code below this line
      String originalString = "THE BROWN DOG JUMPS over the lazy fox";
      String modifiedString = "";
      char ch;
  
      for (int i = 0; i < originalString.length(); i++) {
          ch = originalString.charAt(i);
          if (Character.isLowerCase(ch)){
            modifiedString += Character.toUpperCase(ch);
  
          } else{
             modifiedString += Character.toLowerCase(ch);
          }
        }
  
        System.out.println("The original string is: " + originalString);
        System.out.println("The modified string is: " + modifiedString);
  
  
      
      //add code above this line
    }
  }