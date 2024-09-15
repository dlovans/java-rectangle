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
}
