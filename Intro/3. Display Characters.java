import java.util.Scanner;
public class AsciValue{
    
    public static void main (String[] args) {
        int n=4;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        System.out.println("Enter the digits:");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        } 
        
        for(int i=0;i<n;i++){
           System.out.println(arr[i]+"-"+(char)arr[i]);
        }
        
    }
}
