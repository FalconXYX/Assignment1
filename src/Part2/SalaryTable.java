
package Part2;

import java.util.Scanner;

public class SalaryTable {

    
    public static void main(String[] args) {
         final double INCREASE = 1.03;
        double oldsal, raise,newsal, csal;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Current Salary: ");
        csal = s.nextInt();
        System.out.println("YEAR\t OLD SALARY\t RAISE\t NEW SALARY  ");
        System.out.print("----\t----------\t-----\t----------    ");
        System.out.print(String.format("1\t----------\t%d\t%d    ",csal,csal));
    }
    
}
