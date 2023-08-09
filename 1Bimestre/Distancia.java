import java.util.Scanner;

public class Distancia{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        int Km = Leia.nextInt();
        Leia.close();
        int A;
        A = Km*2;
        System.out.printf(A+" minutos");
    }
}