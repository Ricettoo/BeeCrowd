import java.util.Scanner;

public class Cardapio{
    public static void main(String[] args){
    Scanner Leia = new Scanner(System.in);
    int cod = Leia.nextInt();
    int qtd = Leia.nextInt();
    Leia.close();
    double total = 0.0;

        if (cod == 1){
            total = qtd * 4.0;
        } else if(cod ==2){
            total = qtd * 4.5;
        } else if (cod == 3){
            total = qtd * 5.0;
        } else if (cod == 4){
            total = qtd * 2;
        } else if (cod == 5){
            total = qtd * 1.50;
        } else {
        System.out.println("Codigo nao encontrado.");
        }
        System.out.printf(String.format("Total: R$ %.2f\n",total));
    }
}