import java.util.Scanner;

public class EX1150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Z = sc.nextInt();

        while (Z <= X) {
            Z = sc.nextInt();
        }

        int soma = X;
        int contador = 1;

        while (soma <= Z) {
            X++;
            soma += X;
            contador++;
        }

        System.out.println(contador);

        sc.close();
    }
}
