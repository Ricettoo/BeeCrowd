import java.util.Scanner;

public class Pares5Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pares = 0;

        for (int i = 0; i < 5; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
               
                pares++;
            }
        }

        scanner.close();

        System.out.printf("%d valores pares%n", pares);
    }
}
