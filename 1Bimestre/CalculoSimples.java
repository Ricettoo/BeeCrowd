import java.util.Scanner;

public class CalculoSimples{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        int cod1 = Leia.nextInt();
        int num1 = Leia.nextInt();
        double valor1 = Leia.nextDouble();
        int cod2 = Leia.nextInt();
        int num2 = Leia.nextInt();
        double valor2 = Leia.nextDouble();
        Leia.close();

        double valortotal;
        valortotal = (num1*valor1)+(num2*valor2);
        String resultado = String.format("%.2f",valortotal);
        System.out.println("VALOR A PAGAR: R$ " + resultado);
    }
}