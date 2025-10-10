package ru.mirea.uibo1.spirin.pr4;

// Определение перечисления Season
public enum Season {
    WINTER(-15), // Зима со средней температурой -15
    SPRING(10),  // Весна со средней температурой +10
    SUMMER(25) { // Лето со средней температурой +25 и переопределенным методом
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(12);  // Осень со средней температурой +12

    private final int averageTemperature; // Поле для хранения средней температуры

    // Конструктор для инициализации средней температуры
    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    // Метод для получения средней температуры
    public int getAverageTemperature() {
        return averageTemperature;
    }

    // Метод для получения описания времени года
    public String getDescription() {
        return "Холодное время года";
    }
}