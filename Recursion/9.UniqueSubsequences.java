import java.util.*;
public class main_oops{
    public static void subsequence(String str,int idx,String newStr,HashSet<String>set){
        if(idx==str.length()){
            if(set.contains(newStr)){ //if contains then just return
                return;                  
            }else{
                System.out.println(newStr); // if not then add it to the hashset and then return
                set.add(newStr);
                return;
            }
        
        }
        char currChar = str.charAt(idx);
        //choose
        subsequence(str, idx+1, newStr+currChar,set);
        //not choose
        subsequence(str, idx+1, newStr,set);

    }
    public static void main(String args[]){
        String str = "aaa";
        HashSet<String>set = new HashSet<>();

        subsequence(str, 0,"",set);

    } 
}
