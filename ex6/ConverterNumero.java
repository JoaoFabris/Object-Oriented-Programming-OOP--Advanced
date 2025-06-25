import java.util.Scanner;

public class ConverterNumero {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CONVERSOR STRING PARA NUMERO ===");
        
        try {
            System.out.print("Digite um texto: ");
            String texto = scanner.nextLine();
            
            int numero = Integer.parseInt(texto);
            System.out.println("Sucesso! " + texto + " = " + numero);
            
        } catch (NumberFormatException e) {
            System.out.println("ERRO: Texto nao e um numero valido!");
            System.out.println("Use apenas digitos (ex: 123, -456)");
        }
        
        System.out.println("\n=== TESTES AUTOMATICOS ===");
        String[] testes = {"123", "abc", "-45", "12.5", "0"};
        
        for (String teste : testes) {
            try {
                int resultado = Integer.parseInt(teste);
                System.out.println(teste + " -> " + resultado + " (VALIDO)");
            } catch (NumberFormatException e) {
                System.out.println(teste + " -> ERRO (INVALIDO)");
            }
        }
        
        scanner.close();
    }
}