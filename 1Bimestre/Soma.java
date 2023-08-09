import java.util.Scanner;
        public class Soma{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        int A = Leia.nextInt();
        int B = Leia.nextInt();
        Leia.close();
        double SOMA;
        SOMA = A+B;
        System.out.println("SOMA="+SOMA);
    }
        }