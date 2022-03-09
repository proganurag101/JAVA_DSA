import java.util.*;
public class Placement{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int CSE = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int ECE = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int MECH = sc.nextInt();
        if(CSE<0 || ECE<0 || MECH<0){
            System.out.println("Input is Invalid");
        }else if(CSE==ECE && ECE==MECH){
            System.out.println("None of the department has got the highest placement");
        }else{
            System.out.println("Highest placement");
            if(CSE==ECE && ECE>MECH){                                                   //whichever is highest will be printed
                System.out.println("CSE\nECE");
            }else if(CSE==MECH && MECH>ECE){
                 System.out.println("CSE\nMECH");
            }else if(ECE==MECH && ECE>CSE){
                 System.out.println("ECE\nMECH");
            }else{
               String str = (CSE>(ECE>MECH?ECE:MECH)?"CSE":(ECE>MECH?"ECE":"MECH"));    //whichever is individually highest will pe printed
               System.out.println(str);
            }
        }
    }
} 
