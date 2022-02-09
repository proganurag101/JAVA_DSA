class first_proj{
    public static void moveAllx(String str,int idx,int count,String newstr){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);

        if(currChar=='x'){
            count++;
            moveAllx(str, idx+1,count,newstr);
        }else{
            newstr += currChar;
            moveAllx(str, idx+1,count,newstr);
        }
    }


    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllx(str,0,0,"");

    }
}
