import java.util.Scanner;

public class Intervalo{
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        double A = Leia.nextDouble();
        Leia.close();
        if(A > 0.00 && A < 25.00){
            System.out.println("Intervalo [0,25]");
        }
        if(A > 25.00 && A < 50.00){
            System.out.println("Intervalo [25,50]");
        }
        if(A > 50.00 && A < 75.00){
            System.out.println("Intervalo [50,75]");
        }
        if(A > 75.00 && A < 100.00){
            System.out.println("Intervalo [75,100]");
        } else if(A>100.00){
            System.out.println("Fora de Intervalo");
        }
    }
}