import java.util.Scanner;

public class EX1176 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int j = 0; j < T; j++) {
            int N = sc.nextInt();
            long anterior = 0, atual = 1, proximo;
            for (int i = 0; i < N; i++) {
                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
            System.out.println("Fib(" + N + ") = " + anterior);
        }
        sc.close();
    }

}
