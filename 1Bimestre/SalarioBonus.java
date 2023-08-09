import java.util.Scanner;

public class SalarioBonus{
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        String nome = Leia.nextLine();
        double salario = Leia.nextDouble();
        double vendas = Leia.nextDouble();
        Leia.close();
        double salariobonus;
        salariobonus = (vendas*0.15)+ salario;
        System.out.println(nome);
        String resultado = String.format("%.2f", salariobonus);
        System.out.println("TOTAL = R$ " + resultado);
    }
}