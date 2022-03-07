

 class Main{
    public static boolean [] map = new boolean [26];        //the map is false(0) by default.
    public static void removeDuplicates(String str,int idx,String newStr){
       if(idx==str.length()){
          System.out.println(newStr);                  
          return;
       }
      char currChar = str.charAt(idx);
       if(map[currChar-'a']){                               //currChar-'a' -> gets the index of currChar
          removeDuplicates(str, idx+1,newStr);             //if true we move on to the next index
       }else{
          newStr += currChar;                              //if false we add the char to the newstring and set it to true
          map[currChar-'a']=true;                           
          removeDuplicates(str, idx+1, newStr);

       }
    }


     public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str,0,"");
     }
        

}
