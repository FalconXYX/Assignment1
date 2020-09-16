package Part1;


import java.util.Scanner;


public class Momentum {

    
    public static void main(String[] args) {
        double mass, mom, vel;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Objects Velocity in meters per second: ");
        vel = s.nextDouble();
        System.out.println("Enter the Objects Mass in kilograms:");
        mass = s.nextDouble();
        mom = vel*mass;
        System.out.println(String.format("The momentum of the object is: %.2f", mom));
        

    }
    
}
