
package Part2;

import java.util.Scanner;

public class SalaryTable {

    
    public static void main(String[] args) {
         final double INCREASE = 0.03;
        double oldsal, raise,newsal, csal;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Current Salary: ");
        csal = s.nextInt();
        System.out.println("YEAR\t OLD SALARY\t RAISE\t NEW SALARY  ");
        System.out.println("----\t----------\t-----\t----------    ");
        System.out.println("1\t----------\t"+csal + "\t"+csal+"    ");
        for (int i = 2; i <= 10; i++) {
            oldsal = csal;
            raise  = oldsal*INCREASE;
            newsal = oldsal + raise;
            System.out.println(String.format("%d\t%.2f\t%.2f\t%.2f    ",i,oldsal,raise, newsal ));
            csal = newsal;
            
        }
    }
    
}
