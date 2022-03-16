import java.util.*;
public class main_oops{
    public static void subsequence(String str,int idx,String newStr,HashSet<String>set){
        if(idx==str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
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
