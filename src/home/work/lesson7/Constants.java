package home.work.lesson7;


public final class Constants {

    public static final String OUTPUT_MENU = """
            Добавить корабль в порт введите - 1
            Удалить корабль из порта по номеру причала - 2
            Удалить корабль из порта по названию корабля - 3
            Вывести порт с кораблями введите - 4
            Выйти из программы введите - 5
            """;
    public static final String ENTERING_THE_SHIP = "Введите в какой причал добавить корабль";
    public static final String BERTH_ENTRY_ERROR = "Вы ввели не правильный номер причала";
    public static final String DELETION_BY_BERTH_NUMBER = "Введите из какого причала убрать корабль по номеру причала";
    public static final String DELETE_BY_SHIP_NAME = "Введите из какого причала убрать корабль по Названию корабля";
    public static final String BYE = "Досвидание";
    public static final String POSITION_AT_THE_MERCH = "Причал уже занят другим кораблём";
    public static final String BERTH_NUMBER = "Причал №";
    public static final String TOTAL_MASS_OF_WATER = "Общая масса воды в порту: ";

    private Constants() {
    }
}