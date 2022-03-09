import java.util.*;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        double lit = sc.nextDouble();
        if(lit<=0){
            System.out.println((int)lit+" is an Invalid Input");
            System.exit(0);
        }
        System.out.println("Enter the distance covered");
        double distance = sc.nextDouble();
        
        if(distance<=0){
            System.out.println((int)distance+" is an Invalid Input");
        }else{
            
            //Liters per 100km
            System.out.println("Liters/100KM");
            double val = (lit/distance)*100;
            System.out.printf("%.2f",val);
            
            //miles per gallon
            System.out.println("\nMiles/gallons");
            double miles = distance*0.6214;
            double gallon = lit*0.2642;
            System.out.printf("%.2f",miles/gallon);
            
        }
    }
}
