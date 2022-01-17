
//calculate x^n;

class first_proj{
    public static int calcPower(int x,int n){
        if(x==0){  // base case-1
            return 0;
        }
        if(n==0){  //base case=2
            return 1;
        }
        int xpownm1=calcPower(x, n-1);
        int xpown = x*xpownm1;     //i.e 2*2^4=32.
        return xpown;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        System.out.println(calcPower(x, n));

    }
}

Note:-
  (i)Here function call stack will be of height n+1.
  (ii)Now,we can reduce the stack height to log(n);
