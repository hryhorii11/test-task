import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the x coordinate of the upper left corner of the square:");
            double squareX = scanner.nextDouble();
            System.out.print("Enter the y coordinate of the upper left corner of the square:");
            double squareY = scanner.nextDouble();
            System.out.print("Enter the length of square's side ");

            double side = scanner.nextDouble();
            while (side <= 0) {
                System.out.println("Side must be bigger than 0");
                System.out.print("Enter the length of square's side ");
                side = scanner.nextDouble();
            }
            System.out.print("Enter the x coordinate of the point:");
            double X = scanner.nextDouble();
            System.out.print("Enter the y coordinate of the point:");
            double Y = scanner.nextDouble();
            double maxXPoint = squareX + side;
            double maxYPoint = squareY + side;
            if (X >= squareX && X <= maxXPoint && Y >= squareY && Y <= maxYPoint)
                System.out.println("The point is inside the square.");
            else
                System.out.println("The point is outside the square.");
        }
        catch (InputMismatchException e)
        {
            System.out.println("incorrect input");
        }
    }

}