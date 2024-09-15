import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle;
        double width, height, x, y;

        System.out.println("Enter the width of the rectangle: ");
        width = input.nextDouble();
        input.nextLine();
        System.out.println("Enter the height of the rectangle: ");
        height = input.nextDouble();
        input.nextLine();
        System.out.println("Enter the x of the rectangle: ");
        x = input.nextDouble();
        input.nextLine();
        System.out.println("Enter the y of the rectangle: ");
        y = input.nextDouble();
        rectangle = new Rectangle(x, y, width, height);

        System.out.printf("The area and perimeter of the rectangle are: %.2f and %.2f\n",
                rectangle.calculateArea(), rectangle.calculatePerimeter());

        rectangle.setXY(5, 5);
        rectangle.setHeight(5);
        rectangle.setWidth(5);

        System.out.printf("The area and perimeter of the rectangle are: %.2f and %.2f",
                rectangle.calculateArea(), rectangle.calculatePerimeter());
    }
}