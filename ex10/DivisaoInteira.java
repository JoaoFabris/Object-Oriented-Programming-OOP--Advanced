public class DivisaoInteira {
    
    public int dividir(int dividendo, int divisor) throws DivisaoInteiraInvalidaException {
        
        if (divisor == 0) {
            throw new DivisaoInteiraInvalidaException("Divisão por zero não é permitida");
        }
        
        if (dividendo % divisor != 0) {
            throw new DivisaoInteiraInvalidaException("A divisão não é exata");
        }
        
        return dividendo / divisor;
    }
    
    public boolean isDivisaoExata(int dividendo, int divisor) {
        if (divisor == 0) {
            return false;
        }
        return dividendo % divisor == 0;
    }
}