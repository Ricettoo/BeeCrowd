import java.util.Scanner;

public class Multiplos{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        int A = Leia.nextInt();
        int B = Leia.nextInt();
        Leia.close();

        if(A%B==0|| B%A==0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}