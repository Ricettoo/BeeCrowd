import java.util.Scanner;

public class Triangulo{
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        double A = Leia.nextDouble();
        double B = Leia.nextDouble();
        double C = Leia.nextDouble();
        Leia.close();

        if(A<B+C && B<A+C && C<A+B){
            double perimetro = A+B+C;
            System.out.printf("perimetro=%.1f",perimetro);
        } else {
            double area = ((A+B)*C)/2;
            System.out.printf("area=%.1f",area);
        }
    }
}