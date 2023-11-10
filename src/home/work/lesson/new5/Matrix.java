package home.work.lesson.new5;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.Random;

public class Matrix {
    private final Random random = new Random();
    private final int size;

    public void outputOfAllTasks() {
        String[][] matrix = new String[size][size];
        dataInputAndOutput(matrix);
        comparisonDiagonals(matrix);
        displayingTextElementsRange(creatingArrayDiagonalElements(matrix));
        displayNumberElementsRounded(creatingArrayDiagonalElements(matrix));
    }

    public String randomNumber() {
        double randomNubmer = Math.random() + 1;
        BigDecimal rounding = new BigDecimal(randomNubmer);
        BigDecimal result = rounding.setScale(5, RoundingMode.HALF_UP);
        return result.toString();
    }

    public String randomSymbols() {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            int randomNumber = random.nextInt(2);
            if (randomNumber == 1) {
                randomNumber = random.nextInt(122 - 97 + 1) + 97;
            } else {
                randomNumber = random.nextInt(90 - 65 + 1) + 65;
            }
            char symbol = (char) randomNumber;
            text.append(symbol);
        }
        return text.toString();
    }

    public void dataInputAndOutput(String[][] matrix) {
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                counter++;
                if ((counter == 3)) {
                    matrix[i][j] = randomNumber();
                    counter = 0;
                } else {
                    matrix[i][j] = randomSymbols();
                }
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public String[] creatingArrayDiagonalElements(String[][] matrix) {
        String[] diagonalElements = new String[matrix.length + matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonalElements[i] = matrix[i][i];
            diagonalElements[i + matrix.length] = matrix[i][matrix.length - 1 - i];
        }
        return diagonalElements;
    }


    public void displayNumberElementsRounded(String[] diagonalElements) {
        int counter = 0;
        StringBuilder text = new StringBuilder();
        for (String n : diagonalElements) {
            if (n.matches("^[0-9]*[.][0-9]+$")) {
                counter++;
            }
        }

        int counter1 = 0;
        double[] numbers = new double[counter];
        for (String diagonalElement : diagonalElements) {
            if (diagonalElement.matches("^[0-9]*[.][0-9]+$")) {
                numbers[counter1] = Double.parseDouble(diagonalElement);
                if (numbers[counter1] > 1.7) {
                    numbers[counter1] = Math.ceil(numbers[counter1] * 10) / 10;
                    text.append(numbers[counter1]).append("_");
                } else {
                    numbers[counter1] = Math.floor(numbers[counter1] * 10) / 10;
                    text.append(numbers[counter1]).append("_");
                }
                counter1++;
            }
        }
        text.deleteCharAt(text.length() - 1);
        System.out.println(Constants.ROUNDED_NUMBERS + text);
    }

    public void displayingTextElementsRange(String[] diagonalElements) {
        StringBuilder text = new StringBuilder();
        for (String n : diagonalElements) {
            if (n.matches("^[a-zA-Z]*$")) {
                text.append(n, 2, 4).append(",");
            }
        }
        text.deleteCharAt(text.length() - 1);
        System.out.println(Constants.OUTPUT_OF_ELEMENTS + text);
    }


    public void comparisonDiagonals(String[][] matrix) {
        boolean result = true;
        for (int i = 0; i < matrix.length; i++) {
            if (!Objects.equals(matrix[i][i], matrix[i][matrix.length - 1 - i])) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println(Constants.EQAL);
        } else {
            System.out.println(Constants.NOT_EQUAL);
        }
    }


    public Matrix(int size) {
        this.size = size;
    }

}
