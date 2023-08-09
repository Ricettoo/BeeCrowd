import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        int X = Leia.nextInt();
        Leia.close();

        for (int i = 1; i <= X; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
