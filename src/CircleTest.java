public class CircleTest {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.0);
        System.out.println(circle);

        circle = new Circle(4.0, "blue", false);
        System.out.println(circle);
    }

}
