package home.work.lesson12.tasks.task7;

public class Main {
    public static void main(String[] args) {

        CalculationTriangle triangle = new Triangle(5, 5, 4);

        triangle.calculationArea();
        triangle.calculationPerimeter();
        triangle.calculatingMidianIntersectionPoints();

        CalculationTriangle triangle1 = new Triangle();

        triangle1.calculationArea();
        triangle1.calculationPerimeter();
        triangle1.calculatingMidianIntersectionPoints();

    }
}
