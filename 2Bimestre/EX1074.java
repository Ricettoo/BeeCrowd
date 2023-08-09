import java.util.Scanner;

public class EX1074 {
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        System.out.println("Qual a quantidade de valores a ser lido?");
        int qtd = Leia.nextInt();
        for(int i = 0; i<qtd; i++){
            System.out.printf("Digite o Valor %n");
            int valor = Leia.nextInt(5);
            if (valor == 0){
                System.out.println("NULL");
            } else {
                String evenOdd = (valor %2 == 0) ? "EVEN" : "ODD";
                String posiNega = (valor >0) ? "POSITIVE" : "NEGATIVE";
                System.out.println(evenOdd +" "+posiNega);
            }
            
            
        }
        Leia.close();
    }
}