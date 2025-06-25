public class TesteValidadorSenha {

    public static void main(String[] args) {
        ValidadorSenha validador = new ValidadorSenha();

        String[] senhas = {
                "123",
                "minuscula",
                "MAIUSCULA",
                "SemNumero!",
                "SemEspecial123",
                "MinhaSenh@123"
        };

        for (String senha : senhas) {
            System.out.println("Testando senha: " + senha);

            try {
                validador.validarSenha(senha);
                System.out.println("Senha válida");
            } catch (SenhaInvalidaException e) {
                System.out.println("Senha inválida: " + e.getMessage());
            }

            System.out.println();
        }
    }
}