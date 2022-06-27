-

import java.util.Scanner;
import java.lang.Math.*;

public class App {
   public static boolean isPrime(int n){
      if(n==1) return false;
      for(int i=2;i<n;i++){
         if(n%i==0){
            return false;
         }
      }
      return true;
}

public static boolean isPrimeEfficient(int n){
   if(n==1) return false;
   for(int i=2;i*i<=n;i++){      //i<=sqrt(n);
      if(n%i==0){
         return false;
      }
   }
   return true;
}

public static boolean isPrimeMoreEfficient(int n){
   if(n==1) return false; //if n is 1 it's not prime
   if(n%2==0 || n%3==0) return false; // we check if n gets divided by multiples of 2 or 3
   for(int i=5;i*i<=n;i+=5){  //now we only check for only prime numbers
      if(n%i==0 || n%(i+2)==0){ // i=5,11,17,23,29
         return false;
      }
   }
   return true;
}

      

   


   public static void main(String[] args) {
      System.out.println(isPrimeMoreEfficient(911));
   }
}

//2nd Method: from 2 to sqrt(n) as every number till has a pair of factors so we check till sqrt(n);
//3rd method : we handle 1 and 2,3's multiples before then we get that at a gap of 5 numbers there are two numbers from which we check.
