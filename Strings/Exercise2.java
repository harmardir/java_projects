/* 
Write a program that captures input from the user, 
prints the inputted string as many times as its length, 
and prints as many lines of this as the length of the input string.
*/
public class Exercise2 {
    public static void main(String args[]) {
      
      String myString = args[0];
      
      //add code below this line
      for(int i = 0 ; i < myString.length() ; i++){
        for(int j = 1 ; j < myString.length() ; j++){
            System.out.print(myString);
        }
          System.out.println(myString);
      }
  
      
      //add code above this line
    }
  }

  /* test case : cat 
  output :
catcatcat
catcatcat
catcatcat
*/

