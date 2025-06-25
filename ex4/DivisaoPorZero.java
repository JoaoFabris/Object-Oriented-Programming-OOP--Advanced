import java.util.Scanner;

public class DivisaoPorZero {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== TESTE DE DIVISÃO POR ZERO ===");
        
        try {
            System.out.print("Digite um número: ");
            double numero = scanner.nextDouble();
            
            System.out.println("Dividindo " + numero + " por 0...");
            double resultado = numero / 0;
            
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("\n ERRO: Não é possível dividir por zero!");
            System.out.println(" Explicação: A divisão por zero é matematicamente indefinida.");
            System.out.println("   Tente usar um número diferente de zero como divisor.");
            
        } catch (Exception e) {
            System.out.println(" Erro: " + e.getMessage());
        }
        
        // Exemplo de como fazer corretamente
        System.out.println("\n=== EXEMPLO CORRETO ===");
        try {
            System.out.print("Digite um número para dividir por 2: ");
            double numero2 = scanner.nextDouble();
            double resultado2 = numero2 / 2;
            System.out.println(numero2 + " ÷ 2 = " + resultado2);
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        scanner.close();
    }
}