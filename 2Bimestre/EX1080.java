import java.util.Scanner;

public class EX1080 {
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        int[] entrada = new int[100];
        int maior=0;
        int posicao=0;

        for(int i = 0; i<100; i++){
            entrada[i] = Leia.nextInt();
        }
        Leia.close();
        for(int i = 0; i<100; i++){
            if(entrada[i] > maior){
                maior=entrada[i];
                posicao = i+1;

            }
        }
        System.out.println(maior);
        System.out.print("linha "+posicao);
    }
}