//Volume = π * r^2 * h, Surface area = 2πr^2 + 2πrh

public class Cylinder extends Shape3D {

    private double radius;
    private double height;

    public Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}
