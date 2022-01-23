class str_reverse{
    public static void reverse(String s,int n){
        if(n==0){
            System.out.print(s.charAt(n));
            return;
        }
        System.out.print(s.charAt(n)); //value of n changes at every recursive call.
        reverse(s,n-1); //value of n decreases by 1
    }
  
    public static void main(String[] args) {
        String s = "Anurag";   //garunA
        reverse(s,s.length()-1);
    }
}
