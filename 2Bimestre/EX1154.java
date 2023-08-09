import java.util.Scanner;

public class EX1154 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaIdades = 0;
        int quantidadeIndividuos = 0;

        while (true) {
            int idade = sc.nextInt();
            
            if (idade < 0) {
                break;
            }
            
            somaIdades += idade;
            quantidadeIndividuos++;
        }

        double media = (double) somaIdades / quantidadeIndividuos;
        System.out.printf("%.2f%n", media);

        sc.close();
    }
}