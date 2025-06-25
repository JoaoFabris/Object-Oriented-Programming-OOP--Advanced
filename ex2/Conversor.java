public class Conversor {

    public static double converterCelsiusParaFahrenheit(double celsius) throws IllegalArgumentException {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Temperatura não pode ser menor que -273.15°C!");
        }
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        System.out.println("=== CONVERSOR DE TEMPERATURA ===");

        try {
            double resultado = converterCelsiusParaFahrenheit(25);
            System.out.println("25°C = " + resultado + "°F");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            double resultado = converterCelsiusParaFahrenheit(-273.15);
            System.out.println("-273.15°C = " + resultado + "°F");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            double resultado = converterCelsiusParaFahrenheit(-300);
            System.out.println("-300°C = " + resultado + "°F");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}