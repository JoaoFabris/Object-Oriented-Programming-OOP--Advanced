import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraArquivo {  // ← Mude de "LerArquivo" para "LeituraArquivo"
    
    public static void lerArquivo(String nomeArquivo) {
        try {
            File arquivo = new File(nomeArquivo);
            Scanner leitor = new Scanner(arquivo);
            
            System.out.println("Lendo arquivo: " + nomeArquivo);
            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }
            leitor.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("ERRO: Arquivo '" + nomeArquivo + "' não encontrado!");
            System.out.println("Verifique se o arquivo existe no diretório atual.");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== TESTE DE LEITURA DE ARQUIVO ===");
        
        // Teste com arquivo que não existe
        lerArquivo("arquivo_que_nao_existe.txt");
        
        // Teste com arquivo que pode existir
        lerArquivo("teste.txt");
    }
}