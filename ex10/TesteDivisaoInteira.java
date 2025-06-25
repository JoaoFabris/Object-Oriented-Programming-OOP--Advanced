public class TesteDivisaoInteira {
    
    public static void main(String[] args) {
        
        DivisaoInteira divisao = new DivisaoInteira();
        
        // Casos de teste
        int[][] casos = {
            {10, 2},    // Divisão exata
            {15, 3},    // Divisão exata
            {20, 4},    // Divisão exata
            {10, 3},    // Divisão não exata
            {7, 2},     // Divisão não exata
            {8, 0},     // Divisão por zero
            {-10, 2},   // Divisão exata com negativo
            {10, -2},   // Divisão exata com divisor negativo
            {-15, -3},  // Divisão exata com ambos negativos
            {-7, 3}     // Divisão não exata com negativo
        };
        
        System.out.println("TESTE DE DIVISAO INTEIRA");
        System.out.println("========================");
        
        for (int i = 0; i < casos.length; i++) {
            int dividendo = casos[i][0];
            int divisor = casos[i][1];
            
            System.out.println("Teste " + (i + 1) + ": " + dividendo + " ÷ " + divisor);
            
            try {
                int resultado = divisao.dividir(dividendo, divisor);
                System.out.println("Resultado: " + resultado);
            } catch (DivisaoInteiraInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());
            }
            
            System.out.println();
        }
        
        // Teste do método auxiliar
        System.out.println("TESTE DO METODO isDivisaoExata:");
        System.out.println("==============================");
        
        int[][] testesExatos = {{10, 2}, {10, 3}, {8, 0}};
        
        for (int[] teste : testesExatos) {
            int dividendo = teste[0];
            int divisor = teste[1];
            boolean exata = divisao.isDivisaoExata(dividendo, divisor);
            System.out.println(dividendo + " ÷ " + divisor + " é exata? " + exata);
        }
    }
}