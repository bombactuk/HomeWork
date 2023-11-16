package home.work.lesson7;

public class Container extends Deck {
    private final String[] typesOfContainer = new String[]{"Квадратные", "Цилиндрические", "Конусные"};
    private String typeContainer;
    private int containerHeight;
    private static final int[] TYPE_DENSITY = new int[]{1000, 2000};
    private int density;
    private long massOfWater;


    @Override
    public void creationOfName() {
        super.creationOfName();
        typeContainer = typesOfContainer[random.nextInt(typesOfContainer.length)];
        density = TYPE_DENSITY[random.nextInt(TYPE_DENSITY.length)];
        containerHeight = random.nextInt(100 - 10 + 1) + 10;
        massOfWater = Math.round(calculatingTheMassOfWater(typeContainer));
        setWaterInContainers(massOfWater);
    }


    private double calculatingTheMassOfWater(String typeContainer) {
        double massOfWater = 0;
        switch (typeContainer) {
            case "Квадратные": {
                massOfWater = ((Math.pow(getOverallDiameter(), 3) / (3 * Math.sqrt(3))) * density) / 1000;
                break;
            }
            case "Цилиндрические": {
                massOfWater = ((containerHeight * Math.PI * Math.pow(getOverallDiameter(), 2) / 4) * density) / 1000;
                break;
            }
            case "Конусные": {
                massOfWater = ((((double) 1 / 3 * Math.PI * Math.pow((double) getOverallDiameter() / 2, 2))
                        * containerHeight) * density) / 1000;
                break;
            }
        }
        return massOfWater;
    }

    @Override
    public String toString() {
        return super.toString() +
                " (Тип контейнеров:" + typeContainer + ")" +
                " (Высота " + containerHeight + ")" +
                " (Плотность воды :" + density + ")" +
                " (Масса воды в контейнерах:" + massOfWater + " литров)";
    }


    public Container() {

    }

}

