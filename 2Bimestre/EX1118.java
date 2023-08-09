import java.util.Scanner;

public class EX1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;

        while (opcao == 1) {
            int notasValidas = 0;
            double nota1 = 0, nota2 = 0;

            while (notasValidas < 2) {
                double nota = sc.nextDouble();
                
                if (nota < 0 || nota > 10) {
                    System.out.println("nota invalida");
                } else {
                    if (notasValidas == 0) {
                        nota1 = nota;
                    } else {
                        nota2 = nota;
                    }
                    notasValidas++;
                }
            }

            double media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f%n", media);

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = sc.nextInt();
            } while (opcao != 1 && opcao != 2);
        }

        sc.close();
    }
}
