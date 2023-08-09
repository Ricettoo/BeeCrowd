import java.util.Scanner;

public class EX1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        int a = 0, b = 1;

        for (int i = 0; i < N; i++) {
            if (i == N - 1) {
                System.out.print(a);
            } else {
                System.out.print(a + " ");
            }

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();

        sc.close();
    }
}
