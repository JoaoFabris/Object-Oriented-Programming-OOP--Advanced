import java.util.Scanner;

public class CalculadoraDivisao {
    
    public static void main(String[] args) {
        
        DivisaoInteira divisao = new DivisaoInteira();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CALCULADORA DE DIVISAO INTEIRA");
        System.out.println("==============================");
        System.out.println("Digite 'sair' como dividendo para encerrar");
        System.out.println();
        
        while (true) {
            System.out.print("Digite o dividendo: ");
            String entrada = scanner.nextLine();
            
            if (entrada.equals("sair")) {
                break;
            }
            
            try {
                int dividendo = Integer.parseInt(entrada);
                
                System.out.print("Digite o divisor: ");
                int divisor = Integer.parseInt(scanner.nextLine());
                
                int resultado = divisao.dividir(dividendo, divisor);
                System.out.println("Resultado: " + dividendo + " ÷ " + divisor + " = " + resultado);
                
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números inteiros");
            } catch (DivisaoInteiraInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());
            }
            
            System.out.println();
        }
        
        System.out.println("Calculadora encerrada.");
        scanner.close();
    }
}