package home.work.lesson12.tasks.task7;

import java.util.Arrays;

public class Triangle implements CalculationTriangle {

    private final double[] triangle;

    public Triangle() {
        triangle = new double[]{5, 5, 4};
    }

    public Triangle(double a, double b, double c) {
        triangle = new double[]{a, b, c};
    }


    @Override
    public void calculationArea() {
        double floorPerimeter = Arrays.stream(triangle).sum() / 2;
        double area = Math.sqrt(floorPerimeter *
                (floorPerimeter - triangle[0]) *
                (floorPerimeter - triangle[1]) *
                (floorPerimeter - triangle[2]));
        System.out.println(Constants.AREA + area);
    }

    @Override
    public void calculationPerimeter() {
        System.out.println(Constants.PERIMETER + Arrays.stream(triangle).sum());
    }

    @Override
    public void calculatingMidianIntersectionPoints() {
        double median = (double) 1 / 2 *
                Math.sqrt(2 * Math.pow(triangle[1], 2) +
                        2 * Math.pow(triangle[2], 2) -
                        Math.pow(triangle[0], 2));
        System.out.println(Constants.MEDIAN + median);
    }
}
