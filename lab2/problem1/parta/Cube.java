
 // Volume = a^3, Surface area = 6a^2
public class Cube extends Shape3D {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    public double getSide() {
        return side;
    }
}
