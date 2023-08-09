import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);

        int cod = Leia.nextInt();
        int qtd = Leia.nextInt();
        Leia.close();

        double valor;

        if(cod == 1){
            valor = qtd *4.00;
            System.out.println(String.format("Total :R$ %.2f",valor));
        }
        if(cod == 2){
            valor = qtd * 4.50;
            System.out.println(String.format("Total :R$ %.2f",valor));
        }
        if(cod == 3){
            valor = qtd * 5.00;
            System.out.println(String.format("Total :R$ %.2f",valor));
        }
        if(cod == 4){
            valor = qtd *2.00;
            System.out.println(String.format("Total :R$ %.2f",valor));
        }
        if(cod == 5){
            valor = qtd*1.50;
            System.out.println(String.format("Total :R$ %.2f",valor));
        }
    }
}