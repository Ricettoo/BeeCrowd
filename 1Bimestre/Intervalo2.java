import java.util.Scanner;

public class Intervalo2 {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        int N = Leia.nextInt();
        int dentroIntervalo = 0;
        int foraIntervalo = 0;

        for (int i = 0; i < N; i++) {
            int X = Leia.nextInt();
            if (X >= 10 && X <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }

        Leia.close();

        System.out.println(dentroIntervalo + " in");
        System.out.println(foraIntervalo + " out");
    }
}
