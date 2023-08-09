import java.util.Scanner;

public class Produtosimples{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        int A = Leia.nextInt();
        int B = Leia.nextInt();
        Leia.close();
        double PROD;
        PROD = A*B;
        System.out.println("PROD = "+PROD);
    }
}