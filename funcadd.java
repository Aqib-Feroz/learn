import java.util.*;
public class funcadd {
    
    public static void main (String[] args) {

        Scanner inp = new Scanner (System.in);

        int x,y;
        System.out.println("Enter the for x and y: ");
        x=inp.nextInt();
        y=inp.nextInt();
        add(x,y);


    }

    public static void add (int a, int b){

        int sum = a+b;

        System.out.println("The sum of " + a + " and " + b + " is " +sum);


    }
}
