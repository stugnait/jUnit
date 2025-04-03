package geometry;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        if (radius < 0 || height < 0) {
            throw new IllegalArgumentException("Радіус і висота мають бути невід'ємними.");
        }
        this.radius = radius;
        this.height = height;
    }

    public double getBaseArea() {
        return Math.PI * radius * radius;
    }

    public double getLateralArea() {
        return 2 * Math.PI * radius * height;
    }

    public double getSurfaceArea() {
        return 2 * getBaseArea() + getLateralArea();
    }

    public double getVolume() {
        return getBaseArea() * height;
    }
}
