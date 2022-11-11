public class CylinderTest {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3.0, 10.0);
        System.out.println(cylinder);

        cylinder = new Cylinder(4.0, 11.0, "orange", false);
        System.out.println(cylinder);
    }
}
