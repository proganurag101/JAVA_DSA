



class floccurance{
    public static int first = -1;
    public static int last =  -1;
    public static void occurance(String s,int ind,char element){
        if(ind==s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(s.charAt(ind)==element){
            if(first==-1){
                first = ind;
            }else{
                last = ind;
            }
        }
        occurance(s,ind+1,element);

    }
  
    public static void main(String[] args) {
        String s = "abbaacdaefaah";
        occurance(s,0,'a');
       
    }
}
