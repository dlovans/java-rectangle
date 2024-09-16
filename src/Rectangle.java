public class Rectangle {
    /**
     * x coordinate.
     */
    private double x;

    /**
     * y coordinate.
     */
    private double y;

    /**
     * Width of rectangle.
     */
    private double width;

    /**
     * Height of rectangle.
     */
    private double height;

    /**
     * Creates an instance of Rectangle with default values.
     */
    public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    /**
     * Creates an instance of Rectangle with default and specified values.
     * @param width - Width of rectangle.
     * @param height - Height of rectangle.
     */
    public Rectangle(double width, double height) {
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }

    /**
     * Creates an instance of Rectangle with specified values.
     *
     * @param x - x coordinate.
     * @param y - y coordinate.
     * @param width - Width of rectangle.
     * @param height - Height of rectangle.
     */
    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return - The area of rectangle.
     */
    public double calculateArea() {
        return this.width * this.height;
    }

    /**
     * Calculates the perimeter of the rectangle.
     *
     * @return - Perimeter of rectangle.
     */
    public double calculatePerimeter() {
        return this.width * 2 + this.height * 2;
    }

    /**
     * Getter for Y-coordinate.
     * @return - y coordinate.
     */
    public double getY() {
        return y;
    }

    /**
     * Getter for X-coordinate.
     * @return - x coordinate.
     */
    public double getX() {
        return x;
    }


    /**
     * Sets the X and Y coordinates.
     *
     * @param x - x coordinate.
     * @param y - y coordinate.
     */
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Getter for width.
     * @return - Width of rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Getter for height.
     * @return - Height of rectangle.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the width of the rectangle.
     *
     * @param width - Width of rectangle.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Sets the height of the rectangle.
     *
     * @param height - Height of the rectangle.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Checks if two rectangles overlap.
     * @param rectangleOne - Rectangle object.
     * @param rectangleTwo - Rectangle object.
     */
    public static void checkCollision(Rectangle rectangleOne, Rectangle rectangleTwo) {
        boolean absentOverlap =
                rectangleOne.getX() + rectangleOne.getWidth() <= rectangleTwo.getX() ||
                rectangleTwo.getX() + rectangleTwo.getWidth() <= rectangleOne.getX() ||
                rectangleOne.getY() + rectangleOne.getHeight() <= rectangleTwo.getY() ||
                rectangleTwo.getY() + rectangleTwo.getHeight() <= rectangleOne.getY();

        if (absentOverlap) {
            System.out.println("Rectangles do NOT overlap!");
        } else {
            System.out.println("Rectangles overlap!");
        }
    }
}
