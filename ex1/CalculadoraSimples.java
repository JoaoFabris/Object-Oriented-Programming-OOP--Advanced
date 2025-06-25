public class CalculadoraSimples {
    
    public static double dividir(double numerador, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Erro: Não é possível dividir por zero!");
        }
        return numerador / divisor;
    }
    
    public static void main(String[] args) {
        System.out.println("=== CALCULADORA ===");
        
        // Teste 1: Divisão normal
        try {
            double resultado = dividir(10, 2);
            System.out.println("10 ÷ 2 = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        // Teste 2: Divisão por zero
        try {
            double resultado = dividir(15, 0);
            System.out.println("15 ÷ 0 = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        

        double[][] testes = {{20, 4}, {100, 0}, {7, 2}};
        
        for (int i = 0; i < testes.length; i++) {
            try {
                double resultado = dividir(testes[i][0], testes[i][1]);
                System.out.println(testes[i][0] + " ÷ " + testes[i][1] + " = " + resultado);
            } catch (ArithmeticException e) {
                System.out.println(testes[i][0] + " ÷ " + testes[i][1] + " -> " + e.getMessage());
            }
        }
    }
}