
package Part2;
import java.util.Scanner;

public class Divide {

    
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int dividened, divisor, max, min, answer, rem;
        System.out.print("Please Enter the Dividened: ");
        dividened = s.nextInt();
        System.out.print("Please enter the Divisor: " );
        divisor = s.nextInt();
        max = Math.max(dividened, divisor);
        min = Math.min(dividened, divisor);
        answer = max/min;
        rem = max%min;
        System.out.println(String.format("The answer to you question is: %d \nThe remander to you question is: %d", answer, rem));
        
        
                
        
        
    }
    
}
