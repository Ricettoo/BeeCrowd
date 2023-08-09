import java.util.Scanner;

public class Consumo{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        int KM = Leia.nextInt();
        Double GAS = Leia.nextDouble();
        Leia.close();

double KML = KM/GAS;
String resultado = String.format("%.3f",KML);
System.out.println("KM/L = "+resultado);
    }
}