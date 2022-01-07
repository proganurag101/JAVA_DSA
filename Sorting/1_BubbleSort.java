public class Bubble_Sort {
    public static void Print_Array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubble_Sort(int arr[]){
        //bubble sort
        for(int i=0;i<arr.length-1;i++){
    
            for(int j=0;j<arr.length-i-1;j++){    //
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

        }
        
    }
    Print_Array(arr);
}
    public static void main(String args[]) {
        int arr[] = {7,8,3,2};
        bubble_Sort(arr);
}
}
