public class Cylinder extends Circle {

    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color, boolean filled) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAroundArea() {
        return 2 * Math.PI * getRadius() * getHeight();
    }

    public double getTotalArea() {
        return (2 * Math.PI * Math.pow(getRadius(),2)) + (2 * Math.PI * getRadius() * getHeight());
    }

    public double getBottomPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "A Cylinder with height = " + getHeight() + ", which is a subclass of " + super.toString();
    }
}
