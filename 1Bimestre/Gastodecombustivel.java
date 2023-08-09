import java.util.Scanner;

public class Gastodecombustivel{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        int horas = Leia.nextInt();
        int velomedia = Leia.nextInt();
        Leia.close();
        double resultado = velomedia/12;
        String resultadofinal = String.format("%.3f",resultado);
        System.out.printf(resultadofinal);
    }   
}