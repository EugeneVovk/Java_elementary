package ru.job4j.converter;

/**
 * необходимо разработать конвертер валюты
 */
public class Converter {

    public static float rubleToEuro(float value) {
        return value / 57.15F;
    }

    public static float rubleToDollar(float value) {
        return value / 56.56F;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.printf("140 rubles are %.2f euro.\n", euro);
        System.out.printf("140 rubles are %.2f dollars.\n", dollar);
    }
}
