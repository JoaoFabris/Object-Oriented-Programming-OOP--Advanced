public class SaldoInsuficienteException extends Exception {
    
    private double saldoAtual;
    private double valorSaque;
    
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
    
    public SaldoInsuficienteException(String mensagem, double saldoAtual, double valorSaque) {
        super(mensagem);
        this.saldoAtual = saldoAtual;
        this.valorSaque = valorSaque;
    }
    
    public double getSaldoAtual() {
        return saldoAtual;
    }
    
    public double getValorSaque() {
        return valorSaque;
    }
    
    public double getDeficit() {
        return valorSaque - saldoAtual;
    }
}