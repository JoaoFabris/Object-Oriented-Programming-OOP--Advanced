public class Teste {
    
    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria("João", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("Maria", 500.0);
        
        System.out.println("Saldo inicial João: R$ " + conta1.getSaldo());
        System.out.println("Saldo inicial Maria: R$ " + conta2.getSaldo());
        System.out.println();
        
        // Teste 1: Transferência válida
        System.out.println("Teste 1: Transferir R$ 200");
        try {
            conta1.transferir(conta2, 200.0);
            System.out.println("Transferência realizada!");
        } catch (TransferenciaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        System.out.println("Saldo João: R$ " + conta1.getSaldo());
        System.out.println("Saldo Maria: R$ " + conta2.getSaldo());
        System.out.println();
        
        // Teste 2: Valor zero
        System.out.println("Teste 2: Transferir R$ 0");
        try {
            conta1.transferir(conta2, 0.0);
            System.out.println("Transferência realizada!");
        } catch (TransferenciaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println();
        
        // Teste 3: Valor negativo
        System.out.println("Teste 3: Transferir R$ -50");
        try {
            conta1.transferir(conta2, -50.0);
            System.out.println("Transferência realizada!");
        } catch (TransferenciaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println();
        
        // Teste 4: Saldo insuficiente
        System.out.println("Teste 4: Transferir R$ 2000");
        try {
            conta1.transferir(conta2, 2000.0);
            System.out.println("Transferência realizada!");
        } catch (TransferenciaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        System.out.println("Saldo final João: R$ " + conta1.getSaldo());
        System.out.println("Saldo final Maria: R$ " + conta2.getSaldo());
    }
}