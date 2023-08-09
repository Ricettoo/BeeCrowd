import java.util.Scanner;

public class EX1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        int codigo;

        do {
            codigo = sc.nextInt();

            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            } else{
                System.out.println("Código inválido. Digite novamente.");
            }

        } while (codigo != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}