public class ContaBancaria {
    
    private String numeroConta;
    private String titular;
    private double saldo;
    
    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado: R$ " + valor);
            System.out.println("Saldo atual: R$ " + saldo);
        } else {
            System.out.println("ERRO: Valor de deposito deve ser positivo!");
        }
    }
    
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo!");
        }
        
        if (valor > saldo) {
            throw new SaldoInsuficienteException(
                "Saldo insuficiente para realizar o saque!", 
                saldo, 
                valor
            );
        }
        
        saldo -= valor;
        System.out.println("Saque realizado: R$ " + valor);
        System.out.println("Saldo atual: R$ " + saldo);
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void exibirExtrato() {
        System.out.println("=== EXTRATO BANCARIO ===");
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("========================");
    }
}