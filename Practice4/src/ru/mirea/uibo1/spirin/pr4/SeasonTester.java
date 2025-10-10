package ru.mirea.uibo1.spirin.pr4;

// Класс для демонстрации работы с перечислением Season
public class SeasonTester {

    public static void main(String[] args) {
        // 1. Создание переменной, содержащей любимое время года
        Season myFavoriteSeason = Season.SUMMER;
        printSeasonInfo(myFavoriteSeason);

        // 2. Использование оператора switch
        printSeasonMessage(myFavoriteSeason);
        printSeasonMessage(Season.WINTER);
        printSeasonMessage(Season.AUTUMN);
        printSeasonMessage(Season.SPRING);


        // 6. Распечатка всех времен года, их средней температуры и описания
        System.out.println("\nИнформация о всех временах года:");
        for (Season season : Season.values()) {
            System.out.println("Время года: " + season.name() +
                    ", Средняя температура: " + season.getAverageTemperature() + "°C" +
                    ", Описание: " + season.getDescription());
        }
    }

    // Метод для вывода информации о времени года
    public static void printSeasonInfo(Season season) {
        System.out.println("Мое любимое время года: " + season.name());
        System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
        System.out.println("Описание: " + season.getDescription());
    }

    // Метод, использующий switch для вывода сообщения в зависимости от времени года
    public static void printSeasonMessage(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
        }
    }
}
