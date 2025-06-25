public class ValidadorSenha {
    
    private static final int COMPRIMENTO_MINIMO = 8;
    
    public void validarSenha(String senha) throws SenhaInvalidaException {
        
        if (senha == null) {
            throw new SenhaInvalidaException("A senha não pode ser nula");
        }
        
        if (senha.length() < COMPRIMENTO_MINIMO) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres");
        }
        
        if (!temLetraMaiuscula(senha)) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos uma letra maiúscula");
        }
        
        if (!temLetraMinuscula(senha)) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos uma letra minúscula");
        }
        
        if (!temNumero(senha)) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos um número");
        }
        
        if (!temCaractereEspecial(senha)) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos um caractere especial");
        }
    }
    
    private boolean temLetraMaiuscula(String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean temLetraMinuscula(String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean temNumero(String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean temCaractereEspecial(String senha) {
        String caracteresEspeciais = "!@#$%^&*()";
        for (char c : senha.toCharArray()) {
            if (caracteresEspeciais.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
}