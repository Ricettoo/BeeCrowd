import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        double salario = Leia.nextDouble();
        Leia.close();

        double impostoDeRenda = 0;

        if (salario <= 2000) {
            impostoDeRenda = 0;
        } else if (salario <= 3000) {
            impostoDeRenda = (salario - 2000) * 0.08;
        } else if (salario <= 4500) {
            impostoDeRenda = (salario - 3000) * 0.18 + 1000 * 0.08;
        } else {
            impostoDeRenda = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        if (impostoDeRenda == 0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f\n", impostoDeRenda);
        }
    }
}
