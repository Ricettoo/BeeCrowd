import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
    int dias = Leia.nextInt();

    int Ano = dias / 365;
    dias %= 365;

    int meses = dias / 30;
    dias %= 30;

    Leia.close();

    System.out.printf("%d Anos\n",Ano);
    System.out.printf("%d Meses\n",meses);
    System.out.printf("%d Dias\n",dias);

    }
}