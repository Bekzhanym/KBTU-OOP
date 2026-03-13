/**
 * Represents a sphere.
 * Volume = (4/3)πr^³, Surface area = 4πr^²
 */
public class Sphere extends Shape3D {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
