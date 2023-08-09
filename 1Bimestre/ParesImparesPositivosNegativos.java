import java.util.Scanner;

public class ParesImparesPositivosNegativos {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        
            int pares = 0;
            int impares = 0;
            int positivos = 0;
            int negativos = 0;

        for (int i = 0; i < 5; i++) {
            int valor = Leia.nextInt();

            if (valor % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (valor > 0) {
                positivos++;
            } else if (valor < 0) {
                negativos++;
            }
        }

        Leia.close();

        System.out.printf("%d valor(es) par(es)%n", pares);
        System.out.printf("%d valor(es) impar(es)%n", impares);
        System.out.printf("%d valor(es) positivo(s)%n", positivos);
        System.out.printf("%d valor(es) negativo(s)%n", negativos);
    }
}