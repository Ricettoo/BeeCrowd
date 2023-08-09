import java.util.Scanner;

public class EX1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            int contador = 0;
            int soma = 0;
            
            while (contador < Y) {
                if (X % 2 != 0) {
                    soma += X;
                    contador++;
                }
                X++;
            }
            
            System.out.println(soma);
        }
        
        sc.close();
    }
}
