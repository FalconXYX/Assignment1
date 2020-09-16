
import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;

public class BarGraph {

    static SketchPadWindow window = new SketchPadWindow(800, 600);
    static Pen p = new StandardPen(window);

    public static void main(String[] args) {
        int v1, v2, v3, v4;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Value 1: ");
        v1 = s.nextInt();
        System.out.print("Enter Value 2: ");
        v2 = s.nextInt();
        System.out.print("Enter Value 3: ");
        v3 = s.nextInt();
        System.out.print("Enter Value 4: ");
        v4 = s.nextInt();
        p.setWidth(8);
        p.setColor(Color.black);
        p.up();
        p.move(-300, 250);
        p.down();
        p.move(-300, -250);
        p.move(550, -250);
        makebar(Color red,v1, -200,-250);
        makebar(Color red,v1, -100,-250);
        makebar(Color red,v1, 0,-250);
        makebar(Color red,v1, 100,-250);
        
        
    }

    public static void makebar(Color col, int l, int y, int x) {
        p.setWidth(8);
        p.up();
        p.move(x, y);
        p.down();
        p.setColor(Color.col);
        p.setDirection(90);
        p.move(l);
        p.up();
        p.move(5);
        p.down();
        p.drawString(l+"");
        

    }

}
