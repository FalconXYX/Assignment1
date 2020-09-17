package Part2;

import java.util.Scanner;

public class PowerChart {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int input, answer;
        while(true){
        System.out.print("Enter Number Between 1-10");
        input = s.nextInt();
        if(input > 0 && input < 11){break;}
       
        }
        
        System.out.println("X \t 2^X");
        System.out.println("__ \t ____");
        for (int i = 0; i <= input; i++) {
            answer  = (int) Math.pow(2, i);
            System.out.println(String.format("%d \t 2^%d=%d", i,i,answer));
                    
            
            
        }
        
       
      
    }
    
}
