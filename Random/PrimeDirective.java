/**
 * A prime number is an integer greater than 1 that is only divisible by 1 and itself.
   For example, 2, 3, 5, and 7 are all prime numbers, but 4, 6, 8, and 9 are not.
   Build a PrimeDirective.java program that creates an ArrayList of all prime numbers in an array.
 */
import java.util.ArrayList;

class PrimeDirective {
  
  public boolean isPrime(int number){
   if (number == 2){
     return true;
   }else if (number < 2){
     return false;
   }
   for (int i = 2 ; i < number ; i++) {
     if(number % i == 0){
       return false;
     }else{
       return true;
     }
   }
   return true;
 } 

 public ArrayList<Integer> onlyPrimes(int[] numbers){

   ArrayList<Integer> primes = new ArrayList<Integer>();

   for (int number: numbers){
     if(isPrime(number)){
       primes.add(number);
     }

   }

 return primes;
 }


  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

//System.out.println(pd.isPrime(6));
//System.out.println(pd.isPrime(7));
//System.out.println(pd.isPrime(2));
//System.out.println(pd.isPrime(0));
System.out.println(pd.onlyPrimes(numbers));
// should print [29, 11, 101, 43, 89]

  }  

}