package HomeWorkLessonNew5;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.Random;

public class Matrix {
    private final Random random = new Random();
    private final int size;

    public void outputOfAllTasks() {
        String[][] cats = new String[size][size];
        dataInputAndOutput(cats);
        comparisonDiagonals(cats);
        displayingTextElementsRange(creatingArrayDiagonalElements(cats));
        displayNumberElementsRounded(creatingArrayDiagonalElements(cats));
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

    public void dataInputAndOutput(String[][] cats) {
        int counter = 0;
        for (int i = 0; i < cats.length; i++) {
            for (int j = 0; j < cats.length; j++) {
                counter++;
                if ((counter == 3)) {
                    cats[i][j] = randomNumber();
                    counter = 0;
                } else {
                    cats[i][j] = randomSymbols();
                }
                System.out.print(" " + cats[i][j] + " ");
            }
            System.out.println();
        }
    }


    public String[] creatingArrayDiagonalElements(String[][] cats) {
        String[] diagonalElements = new String[cats.length + cats.length];
        for (int i = 0; i < cats.length; i++) {
            diagonalElements[i] = cats[i][i];
            diagonalElements[i + cats.length] = cats[i][cats.length - 1 - i];
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

    public void displayingTextElementsRange(String[] array) {
        StringBuilder text = new StringBuilder();
        for (String n : array) {
            if (n.matches("^[a-zA-Z]*$")) {
                text.append(n, 2, 4).append(",");
            }
        }
        text.deleteCharAt(text.length() - 1);
        System.out.println(Constants.OUTPUT_OF_ELEMENTS + text);
    }


    public void comparisonDiagonals(String[][] cats) {
        boolean result = true;
        for (int i = 0; i < cats.length; i++) {
            if (!Objects.equals(cats[i][i], cats[i][cats.length - 1 - i])) {
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
