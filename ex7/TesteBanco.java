import java.util.Scanner;

public class TesteBanco {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA BANCARIO ===");
        
        // Criando conta
        ContaBancaria conta = new ContaBancaria("12345-6", "João Fabris", 1000.0);
        conta.exibirExtrato();
        
        while (true) {
            try {
                System.out.println("\n=== MENU ===");
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Ver Saldo");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opcao: ");
                
                int opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1:
                        System.out.print("Valor para deposito: R$ ");
                        double valorDeposito = scanner.nextDouble();
                        conta.depositar(valorDeposito);
                        break;
                        
                    case 2:
                        System.out.print("Valor para saque: R$ ");
                        double valorSaque = scanner.nextDouble();
                        conta.sacar(valorSaque);
                        break;
                        
                    case 3:
                        conta.exibirExtrato();
                        break;
                        
                    case 4:
                        System.out.println("Sistema encerrado!");
                        scanner.close();
                        return;
                        
                    default:
                        System.out.println("Opcao invalida!");
                }
                
            } catch (SaldoInsuficienteException e) {
                System.out.println("ERRO: " + e.getMessage());
                System.out.println("Saldo atual: R$ " + e.getSaldoAtual());
                System.out.println("Valor solicitado: R$ " + e.getValorSaque());
                System.out.println("Deficit: R$ " + e.getDeficit());
                System.out.println("Deposite pelo menos R$ " + e.getDeficit() + " para realizar este saque.");
                
            } catch (IllegalArgumentException e) {
                System.out.println("ERRO: " + e.getMessage());
                
            } catch (Exception e) {
                System.out.println("ERRO inesperado: " + e.getMessage());
                scanner.nextLine(); // Limpar buffer
            }
        }
    }
}