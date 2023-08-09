import java.util.Scanner;

public class Diferenca{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        double A = Leia.nextDouble();
        double B = Leia.nextDouble();
        double C = Leia.nextDouble();
        double D = Leia.nextDouble();
        Leia.close();
        double DIF;
        DIF = (A * B - C * D);
        System.out.println("DIFERENCA = " + DIF);
    }
}