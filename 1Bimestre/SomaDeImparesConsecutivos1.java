import java.util.Scanner;

public class SomaDeImparesConsecutivos1 {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        int X = Leia.nextInt();
        int Y = Leia.nextInt();
        Leia.close();

        int menor = Math.min(X, Y);
        int maior = Math.max(X, Y);
        int soma = 0;

        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
    }
}
