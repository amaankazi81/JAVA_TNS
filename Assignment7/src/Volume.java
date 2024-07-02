
public class Volume {
    private double width;
    private double height;
    private double depth;

    // Constructor with no parameters
    public Volume() {
        this.width = 0;
        this.height = 0;
        this.depth = 0;
    }

    // Constructor with one parameter
    public Volume(double side) {
        this.width = side;
        this.height = side;
        this.depth = side;
    }

    // Constructor with three parameters
    public Volume(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    public double volume() {
        return width * height * depth;
    }
}
