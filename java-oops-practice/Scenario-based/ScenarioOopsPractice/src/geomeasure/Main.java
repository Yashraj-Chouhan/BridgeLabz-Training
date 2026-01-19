package geomeasure;
import java.util.*;

class Line {
    private double x1, y1, x2, y2;

    // Constructor
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate length
    public double getLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

public class Main {

    static void compareLines(Line l1, Line l2) {
        double len1 = l1.getLength();
        double len2 = l2.getLength();

        if (len1 == len2) {
            System.out.println("Both lines are equal in length.");
        } else if (len1 > len2) {
            System.out.println("Line 1 is longer.");
        } else {
            System.out.println("Line 2 is longer.");
        }
    }

    public static void main(String[] args) {

        List<Line> lines = new ArrayList<>();

        Line line1 = new Line(0, 0, 4, 0);
        Line line2 = new Line(0, 0, 3, 4);

        lines.add(line1);
        lines.add(line2);

        compareLines(line1, line2);
    }
}
