class Main{
   public static void subsequences(String str,int idx,String newstr){
      if(idx==str.length()){
         System.out.println(newstr);
         return;
      }
      char curChar = str.charAt(idx);
      //to choose
      subsequences(str, idx+1, newstr+curChar);
      //to not choose
      subsequences(str, idx+1, newstr); //nothing added
   }
     public static void main(String[] args) {
        String str = "abc";
        subsequences(str,0,"");
     }
        

}
