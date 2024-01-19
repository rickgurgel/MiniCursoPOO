package Aula190124.TemperatureConversion;

public class Converter {

    public double celsiusToFahrenreit(double f){
        return ((f - 32) / 1.8);
    }

    public static double fahrenreitToCelsius(double c){
        return 1.8 * c + 32;
    }
}
