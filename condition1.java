// Using if else condition
import java.util.*;
public class condition1 {
    
    public static void main (String[] args) {
       
        Scanner inp = new Scanner (System.in);

        int temp;
        System.out.println("Enter the temperature:");
        temp =inp.nextInt();

        if (temp > 28){
            System.out.println("The outside temperaturee is high.");
        }
        else{
            System.out.println("The outside temperature is fine. ");
        }
    }
}
