import java.util.Arrays;
import java.util.Comparator;
public class Test {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }


        Square[] squares = new Square[3];
        squares[0] = new Square(5);
        squares[1] = new Square(2.4,"green", true);
        squares[2] = new Square();

        System.out.println("Pre-sorted:");
        for (Square square : squares) {
            System.out.println(square);
        }

        Comparator squareComparator = new SquareComparator();
        Arrays.sort(squares, squareComparator);

        System.out.println("After-sorted:");
        for (Square square : squares) {
            System.out.println(square);
        }
    }

}
