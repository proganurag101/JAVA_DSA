class reverseString{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Anurag");
        int n = sb.length();

        for(int i=0;i<n/2;i++){
            int front = i;          //element from start-0='A','n','u'
            int back = n-i-1;       //element from end- 5-0-1= 4 = 'g','a','r'

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front,backchar);      //(index,char to be inserted)
            sb.setCharAt(back,frontchar);   


        }
        System.out.println(sb); //garunA
        


        

    }
}
