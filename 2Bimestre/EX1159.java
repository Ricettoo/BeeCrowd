import java.util.Scanner;

public class EX1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        
        while (X != 0) {
            int soma = 0;
            int contador = 0;
            
            while (contador < 5) {
                if (X % 2 == 0) {
                    soma += X;
                    contador++;
                }
                X++;
            }
            
            System.out.println(soma);
            
            X = sc.nextInt();
        }
        
        sc.close();
    }
}
