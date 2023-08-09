import java.util.Scanner;

public class EX1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            if (m <= 0 || n <= 0) {
                break;
            }
            
            int menor = Math.min(m, n);
            int maior = Math.max(m, n);
            int soma = 0;
            
            for (int i = menor; i <= maior; i++) {
                soma += i;
            }
            
            System.out.print("Sequência: ");
            for (int i = menor; i <= maior; i++) {
                System.out.print(i);
                if (i < maior) {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
            System.out.println("Soma: " + soma);
        }
        
        sc.close();
    }
}
