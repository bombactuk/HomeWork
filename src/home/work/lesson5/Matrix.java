package home.work.lesson5;


import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Random;

public class Matrix {
    private Random random = new Random();

    public void matrix() {
        String[][] cats = new String[10][10];
        dataInputAndOutput(cats);
        comparisonDiagonals(cats);
        String[] diagonalElements = new String[cats.length + cats.length];
        for (int i = 0; i < cats.length; i++) {
            diagonalElements[i] = cats[i][i];
            diagonalElements[i + cats.length] = cats[i][cats.length - 1 - i];
        }
        сheckingElementsAndOutputtingNumbersAndSymbols(diagonalElements);
    }

    public void dataInputAndOutput(String[][] cats) {
        int element = 0;
        for (int i = 0; i < cats.length; i++) {
            for (int j = 0; j < cats.length; j++) {
                element++;
                if ((element == 3)) {
                    cats[i][j] = randomNumber();
                    element = 0;
                } else {
                    cats[i][j] = randomSymbols();
                }
                System.out.print(" " + cats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void сheckingElementsAndOutputtingNumbersAndSymbols(String[] diagonalElements) {
        StringBuilder builder = new StringBuilder();
        double[] numbers = new double[3];
        int x = 0;
        for (int i = 0; i < diagonalElements.length; i++) {
            if (checkForNumber(diagonalElements[i])) {
                numbers[x] = Double.parseDouble(diagonalElements[i]);
                if (numbers[x] > 1.7) {
                    numbers[x] = Math.ceil(numbers[x] * 10) / 10;
                } else {
                    numbers[x] = Math.floor(numbers[x] * 10) / 10;
                }
                x++;
            } else {
                builder.append(diagonalElements[i].substring(2, 4)).append(",");
            }

        }
        builder.deleteCharAt(builder.length() - 1);
        System.out.println(Constants.OUTPUT_OF_ELEMENTS + builder.toString());
        System.out.println(Constants.ROUNDED_NUMBERS);
        for (double c : numbers) {
            System.out.print(c + "_");
        }

    }

    public static boolean checkForNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
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

    public String randomNumber() {
        double randomNubmer = Math.random() + 1;
        DecimalFormat rounding = new DecimalFormat("#.00000");
        String number = rounding.format(randomNubmer);
        return number.replace(',', '.');
    }

    public String randomSymbols() {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            int randomNum = random.nextInt(2);
            if (randomNum == 1) {
                randomNum = random.nextInt(122 - 97 + 1) + 97;
            } else {
                randomNum = random.nextInt(90 - 65 + 1) + 65;
            }
            char symbol = (char) randomNum;
            text.append(symbol);
        }
        return text.toString();
    }


}

