

import java.util.*;
public class Main{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();  //to reset the cursor of scanner from the prevs nextInt
        String inp[]=new String[n]; //1-d array
        String inp1[][]=new String[n][3]; //2-d array 
        
        for(int i=0;i<n;i++){
             inp[i]=sc.nextLine();  //stores csv values as a whole in a string.
             inp1[i]=inp[i].split(",");
             /*  {
                 {"val1","price1","dis1"},
                 {"val2","price2","dis2"},
                 {"val3","price3","dis3"}
             } */
             
        }
        
        int dis[] = new int [n];
        for(int i=0;i<n;i++){
            int val = Integer.parseInt(inp1[i][1]);
            int disc = Integer.parseInt(inp1[i][2]);
            dis[i] = (disc*val)/100;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(dis[i]<min){
                 min=dis[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(dis[i]==min){
              System.out.println(inp1[i][0]);
            }
            
        }
        
    } 
        
}
