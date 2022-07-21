package ru.job4j.converter;

/**
 * необходимо разработать конвертер валюты
 */
public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70F;
    }

    public static float rubleToDollar(float value) {
        return value / 60F;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float inDollars = 120;
        float expected = 2;
        float actualEuro = Converter.rubleToEuro(inEuro);
        float actualDollars = Converter.rubleToDollar(inDollars);
        System.out.println("140 rubles are 2 euro. Test result : " + (expected == actualEuro));
        System.out.println("140 rubles are 2 dollars. Test result : " + (expected == actualDollars));
    }
}
