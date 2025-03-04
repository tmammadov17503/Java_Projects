package Week04.ArraysOfObejcts.pw;
import java.util.Scanner;
import Week03.GeometryEx.Point;
public class ArrOfPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        Point[] points = new Point[n];
        for(int i=0;i<n;i++) {
            System.out.println("Point number " + i);
            System.out.print("x = ");
            float x = scanner.nextFloat();
            System.out.print("y = ");
            float y = scanner.nextFloat();
            points[i] = new Point(x,y);
            System.out.println("- - - - -");
        }
        Point western, eastern, northern, southern;
        western = eastern = northern = southern = points[0];
        for(int i=1;i<n;i++) {
            if(points[i].getX() < western.getX()) {
                western = points[i];
            }
            if(points[i].getX() > eastern.getX()) {
                eastern = points[i];
            }
            if(points[i].getY() < southern.getY()) {
                southern = points[i];
            }
            if(points[i].getY() > northern.getY()) {
                northern = points[i];
            }
        }


        
        System.out.println("Western: " + western.toString());
        System.out.println("Eastern: " + eastern.toString());
        System.out.println("Northern: " + northern.toString());
        System.out.println("Southern: " + southern.toString());
    }
}
