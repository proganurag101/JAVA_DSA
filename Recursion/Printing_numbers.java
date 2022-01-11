class recursion{
    public static void printNumbers(int n){
        if(n==0){
            return; //breaks the calls
        }
        System.out.println(n); //print the number  5->4->3->2->1
        printNumbers(n-1);     //function calls itself for values from n-1 to 1.
    }
    public static void main(String[] args) {
        int n=5;
        printNumbers(n);  //Main function initiates the call.
    }
}
