/*
Replacing Vowels with a *
You are going to write a program that takes a string called myString 
and returns the string but with a * in the place of vowels.
 Assume that vowels are upper and lowercase a, e, i, o, u. 
 For example, if myString = "Hello", then your program will print "H*ll*".
 */

public class LabChallenge {
    public static void main(String args[]) {
      
      String myString = "Watermelon!";
      char ch;
      
      //add code below this line
      for(int i = 0 ; i < myString.length() ; i++){
        ch = myString.charAt(i);
  
       if (ch == 'a' || ch == 'e' || ch == 'i' || 
              ch == 'o' || ch == 'u' || ch == 'A' ||
              ch == 'E' || ch == 'I' || ch == 'O' ||
               ch == 'U'){
  
              myString = myString.replace(ch,'*');   
  
               }
  
      }
        System.out.println(myString);
      
      //add code above this line
    }
  }
