public class Idade {
    
    public static void verificarIdade(int idade) throws IllegalArgumentException {
        if (idade < 0) {
            throw new IllegalArgumentException("Erro: Idade não pode ser negativa!");
        }
        if (idade > 150) {
            throw new IllegalArgumentException("Erro: Idade não pode ser maior que 150 anos!");
        }
        System.out.println("Idade válida: " + idade + " anos");
    }
    
    public static void main(String[] args) {
        System.out.println("=== VALIDAÇÃO DE IDADE ===");
        
        // Idades para teste
        int[] idades = {25, -5, 0, 150, 151, 30, 100, -10, 75};
        
        for (int idade : idades) {
            try {
                verificarIdade(idade);
            } catch (IllegalArgumentException e) {
                System.out.println("Idade " + idade + " -> " + e.getMessage());
            }
        }
        
        // Simulação de cadastro
        System.out.println("\n=== SIMULAÇÃO DE CADASTRO ===");
        String[] nomes = {"João", "Maria", "Pedro", "Ana", "Carlos"};
        int[] idadesCadastro = {30, -2, 25, 200, 45};
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Cadastrando " + nomes[i] + " (" + idadesCadastro[i] + " anos): ");
            try {
                verificarIdade(idadesCadastro[i]);
                System.out.println("CADASTRO APROVADO");
            } catch (IllegalArgumentException e) {
                System.out.println("CADASTRO REJEITADO - " + e.getMessage());
            }
        }
    }
}