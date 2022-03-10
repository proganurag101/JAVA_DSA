import java.util.Scanner;
public class Authority{
    public static void main (String[] args) {
      String patt = "[A-Za-z\\s]{1,}";
      Scanner sc = new Scanner(System.in);
      System.out.println("Inmate's name:");
      String s1 = sc.nextLine();
      System.out.println("Inmate's father's name:");
      String s2 = sc.nextLine();
      if(s1.matches(patt) && s2.matches(patt)){
         System.out.println(s1.toUpperCase()+" "+s2.toUpperCase());
      }else{
         System.out.println("Invalid name");
      }
        
    }
}
