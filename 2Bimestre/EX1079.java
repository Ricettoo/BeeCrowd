import java.util.Scanner;

public class EX1079 {
    public static void main(String[] args){
        Scanner Leia = new Scanner (System.in);
        int testes = Leia.nextInt();

        for(int i = 0; i<testes; i++){
            Double A = Leia.nextDouble();
            Double B = Leia.nextDouble();
            Double C = Leia.nextDouble();
          
            Double resul= (A/2)+(B/3)+(C/5);
            System.out.printf("O resultado foi de %.2f",resul);
        }
        Leia.close();
    }
}
