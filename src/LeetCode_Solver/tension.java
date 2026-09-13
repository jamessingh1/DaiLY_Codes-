package LeetCode_Solver;

public class tension {
    class Solution {
    static final double PI = 3.14159;

    // Babylonian method for square root
    private double sqrt(double x) {
        if (x == 0) {
            return 0;
        }
        double guess = x;
        for (int i = 0; i < 50; i++) {
            guess = (guess + x / guess) / 2.0;
        }
        return guess;
    }

    private double round2(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public double[] areaAndPerimeter(String shape, double[] dims) {
        double area = 0, perimeter = 0;

        if (shape.equals("rectangle")) {
            double length = dims[0], width = dims[1];
            area = length * width;
            perimeter = 2 * (length + width);
        } else if (shape.equals("square")) {
            double side = dims[0];
            area = side * side;
            perimeter = 4 * side;
        } else if (shape.equals("circle")) {
            double r = dims[0];
            area = PI * r * r;
            perimeter = 2 * PI * r;
        } else if (shape.equals("triangle")) {
            double a = dims[0], b = dims[1], c = dims[2];
            perimeter = a + b + c;
            double s = perimeter / 2.0;
            area = sqrt(s * (s - a) * (s - b) * (s - c));
        }

        return new double[] { round2(area), round2(perimeter) };
    }
}
}
