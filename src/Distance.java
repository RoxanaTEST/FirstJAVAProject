import java.util.Scanner;

public class Distance {
    public void calculatedistance() {
        Scanner Distance = new Scanner(System.in);
        System.out.println(" Write your distance in inches, please ");
        double inches = Distance.nextDouble();

        double meters = inches * 0.0254;
        System.out.println(inches + " inches is equals to " + meters + " meters ");

    }
}