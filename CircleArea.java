
public class CircleArea {
    double radius;

    CircleArea(double r) {
        radius = r;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        CircleArea c = new CircleArea(5);
        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Perimeter of Circle: " + c.getPerimeter());
    }
}