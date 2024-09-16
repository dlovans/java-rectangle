import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangleOne;
        Rectangle rectangleTwo;
        double width, height, x, y;

        System.out.println("First rectangle: ");
        System.out.println("Width: ");
        width = input.nextDouble();
        input.nextLine();
        System.out.println("Height: ");
        height = input.nextDouble();
        input.nextLine();
        System.out.println("X-coordinate: ");
        x = input.nextDouble();
        input.nextLine();
        System.out.println("Y-coordinate: ");
        y = input.nextDouble();
        input.nextLine();
        rectangleOne = new Rectangle(x, y, width, height);

        System.out.println("Second rectangle: ");
        System.out.println("Width: ");
        width = input.nextDouble();
        input.nextLine();
        System.out.println("Height: ");
        height = input.nextDouble();
        input.nextLine();
        System.out.println("X-coordinate: ");
        x = input.nextDouble();
        input.nextLine();
        System.out.println("Y-coordinate: ");
        y = input.nextDouble();
        rectangleTwo = new Rectangle(x, y, width, height);

        System.out.printf("First rectangle area and perimenter: %.2f and %.2f\n",
                rectangleOne.calculateArea(), rectangleOne.calculatePerimeter());

        System.out.printf("Second rectangle area and perimenter: %.2f and %.2f\n",
                rectangleTwo.calculateArea(), rectangleTwo.calculatePerimeter());

        Rectangle.checkCollision(rectangleOne, rectangleTwo);
    }
}