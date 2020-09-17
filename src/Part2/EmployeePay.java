package Part2;

import java.util.Scanner;

public class EmployeePay {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double RATE = 15;
        final double OTRATE = 22.5;

        double hours, tpay, rpay, opay;
        for (int i = 1; i < 6; i++) {
            
                hours = tpay = rpay = opay=0;
                System.out.print(String.format("Enter Hours for Employee %d: ", i));
                hours = s.nextInt();
                if (hours > 0 && hours <= 70) {
                    System.out.print("");
                    
                }
                else{return;}
                if (hours > 40) {
                    rpay=  40*RATE;
                    hours-=40;
                    opay = hours*OTRATE;
                    tpay = opay+rpay;
                    System.out.println(String.format("Regular Pay: %.2f \nOver Time Pay: %.2f\nTotal Pay: %.2f", rpay, opay,tpay));
                    
                }
                else{
                    opay = 0;
                    tpay = rpay = RATE*hours;
                    System.out.println(String.format("Regular Pay: %.2f \nOver Time Pay: %.2f\nTotal Pay: %.2f", rpay, opay,tpay));
                                    
                }
            

        }

    }

}
