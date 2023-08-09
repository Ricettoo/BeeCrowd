import java.util.Scanner;

public class NumerosPositivos{
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        double A = Leia.nextDouble();
        double B = Leia.nextDouble();
        double C = Leia.nextDouble();
        double D = Leia.nextDouble();
        double E = Leia.nextDouble();
        double F = Leia.nextDouble();
        Leia.close();

        int positivo = 0;

        if (A > 0){
            positivo++;
        }
        if (B > 0){
            positivo++;
        }
        if (C > 0){
            positivo++;
        }
        if (D > 0){
            positivo++;
        }
        if (E > 0){
            positivo++;
        }
        
        if (F > 0){
            positivo++;
        }
    System.out.printf("%d valores positivos", positivo);
    }
}