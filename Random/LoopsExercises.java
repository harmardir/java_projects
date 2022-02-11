//Exercise 5 - Nested Loops

public class Exercise5 {
    public static void main(String args[]) {
      
      //add code below this line
      for (int i = 1; i < 6; i++) {
      for (int j = 5 - i; j > 0; j--) {
      System.out.print(".");
          }
      System.out.println(i);
  }
    }
  }


  //Exercise 4 - Break !
  public class Exercise4 {
    public static void main(String args[]) {
      
      for (int i = 100; i <= 100; i--) {
        while (true) {
          System.out.println("Print me!");
          break;
        }
        break;
      }
    }
  }

  // Exercise 3 - Loops

  public class Exercise3 {
    public static void main(String args[]) {
      
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      
      if (a > b) {
        int c = b;
        b = a;
        a = c;
      }
      
      //add code below this line
      int sum = 0;
    
     for (int iter = a; iter <= b; iter++) {
    sum += iter;
  }
    
  if (a == b) {
    sum = a;
  }
    
  System.out.println(sum);
  
  
      //add code above this line
    }
  }


  
