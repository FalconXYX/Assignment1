
import java.util.Scanner;


public class PizzaScanner {

    
    public static void main(String[] args) {
        final double LCOST = 1.5;
        final double UCOST = 0.75;
        double tcost, bcost,totalcost;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount of toppings you want: ");
        tcost = 0.75*(s.nextInt());
        System.out.print("Enter the size of pizza you want: ");
        bcost = 0.50*(s.nextInt());
        totalcost = tcost+bcost+UCOST+LCOST;
        
        
        System.out.println(String.format("The labour cost of the Pizza was: %.2f", LCOST));
        System.out.println(String.format("The Utilities cost of the Pizza was: %.2f", UCOST));
        System.out.println(String.format("The base cost of the Pizza was: %.2f", bcost));
        System.out.println(String.format("The toppings cost of the Pizza was: %.2f", tcost));
        System.out.println(String.format("The total cost of the Pizza is: %.2f", totalcost));
        
        
    
    
}
}
//All pizzas have a fixed cost of $1.50 for labor to make the pizza (use a constant)
// All pizzas use $0.75 worth of gas heat for the pizza oven (use a constant)
// Toppings cost $0.75 each
// Basic ingredients (sauce, dough, cheese) cost $0.50 per inch of pizza diameter 
