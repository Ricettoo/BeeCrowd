import java.util.Scanner;

public class DDD{
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);

    System.out.printf("Insira o DDD:");
    int ddd = Leia.nextInt();
    if (ddd == 61){
    System.out.printf("O DDD e um numero de Brasilia");
    } else if (ddd == 71){
    System.out.printf("O DDD e um numero de Salvador");
    } else if (ddd == 11){
    System.out.printf("O DDD e um numero de Sao Paulo");
    } else if (ddd == 21){
    System.out.printf("O DDD e um numero de Rio De Janeiro");
    } else if (ddd == 32){
    System.out.printf("O DDD e um numero de Juiz De Fora");
    } else if (ddd == 19){
    System.out.printf("O DDD e um numero de Campinas");
    } else if (ddd == 27){
    System.out.printf("O DDD e um numero de Vitoria");
    } else if (ddd == 31){
    System.out.printf("O DDD e um numero de Belo Horizonte");
    } else {
        System.out.printf("DDD invalido");
        }
    Leia.close();
    }
}