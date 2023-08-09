import java.util.Scanner;

public class Salario{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        int num = Leia.nextInt();
        int qtd = Leia.nextInt();
        double hrtrabalhada = Leia.nextDouble();
        Leia.close();
        double salario;
        salario = qtd*hrtrabalhada;
        System.out.println("NUMBER = "+ num);
        System.out.println("Salary = U$ " + salario);
        
    }
}