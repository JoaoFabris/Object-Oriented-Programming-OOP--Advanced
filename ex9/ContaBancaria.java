public class ContaBancaria {
    
    private String titular;
    private double saldo;
    
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public void transferir(ContaBancaria contaDestino, double valor) throws TransferenciaInvalidaException {
        
        if (valor <= 0) {
            throw new TransferenciaInvalidaException("O valor da transferência deve ser maior que zero");
        }
        
        if (this.saldo < valor) {
            throw new TransferenciaInvalidaException("Saldo insuficiente");
        }
        
        this.saldo -= valor;
        contaDestino.saldo += valor;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getTitular() {
        return titular;
    }
}