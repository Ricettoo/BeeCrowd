import java.util.Scanner;

public class EX1768 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            if (N % 2 == 0) {
                N++;
            }
            int meio = N / 2;
            
            int espacos = meio;
            int asteriscos = 1;
            
            for (int i = 0; i < meio + 1; i++) {
                String linha = " ".repeat(espacos) + "*".repeat(asteriscos);
                System.out.println(linha);
                espacos--;
                asteriscos += 2;
            }
            
            espacos = meio;
            System.out.println(" ".repeat(espacos) + "*");
            System.out.println();
        }
        
        sc.close();
    }
}
