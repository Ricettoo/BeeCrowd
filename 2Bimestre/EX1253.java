import java.util.Scanner;

public class EX1253 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < N; i++) {
            String textoCodificado = sc.nextLine();
            int deslocamento = sc.nextInt();
            sc.nextLine(); 
            
            String textoDecodificado = decodificarCesar(textoCodificado, deslocamento);
            System.out.println(textoDecodificado);
        }
        
        sc.close();
    }
    
    public static String decodificarCesar(String textoCodificado, int deslocamento) {
        StringBuilder textoDecodificado = new StringBuilder();
        
        for (int i = 0; i < textoCodificado.length(); i++) {
            char caractereAtual = textoCodificado.charAt(i);
            char caractereDecodificado;
            
            if (caractereAtual == ' ') {
                caractereDecodificado = ' ';
            } else {
                int valorDecodificado = ((caractereAtual - 'A' - deslocamento + 26) % 26) + 'A';
                caractereDecodificado = (char) valorDecodificado;
            }
            
            textoDecodificado.append(caractereDecodificado);
        }
        
        return textoDecodificado.toString();
    }
}
