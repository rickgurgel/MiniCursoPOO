package Aula190124.TemperatureConversion;

public class Main {

    public static void main(String[] args) {

        Converter converter = new Converter();

        System.out.println("A temperatura em Fahrenreit é:" + Converter.fahrenreitToCelsius(32));
        System.out.println("A temperatura em Celsius é: " + converter.celsiusToFahrenreit(100));

    }
}
