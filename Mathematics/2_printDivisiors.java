public class App {
   public static void printDivisors(int n){
      for(int i=1;i*i<=n;i++){
         if(n%i==0){
            System.out.println(i);
            if(n/i!=i) System.out.println(n/i); // to stop double printing of the last factor of the first side pair
         }
      }
   }
   public static void printSortedDivisors(int n){
     
      for(int i=1;i*i<=n;i++){
         if(n%i==0){
           System.out.println(i);
         }
      }
      
      for(int i=5;i>=1;i--){
         if(n%i==0 && n/i!=i){
            System.out.println(n/i);
         }
      }

      
}


      

   


   public static void main(String[] args) {
      printDivisors(30);
   }
}
