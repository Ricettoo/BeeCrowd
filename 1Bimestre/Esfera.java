import java.util.Scanner;

public class Esfera{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        int raio = Leia.nextInt();
        Leia.close();
        double pi = 3.14159;
        double volume;
        volume = (4/3.0)*pi*Math.pow(raio,3);
        System.out.println("VOLUME = "+ volume);
    }
}