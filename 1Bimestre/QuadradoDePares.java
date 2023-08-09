import java.util.Scanner;

public class QuadradoDePares {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        int N = Leia.nextInt();
        Leia.close();

        for (int i = 2; i <= N; i += 2) {
            int quadrado = i * i;
            System.out.println(i + "^2 = " + quadrado);
        }
    }
}
