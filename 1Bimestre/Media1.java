import java.util.Scanner;

public class Media1{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        double A = Leia.nextDouble();
        double B = Leia.nextDouble();
        Leia.close();
        double media;
        media = ((A * 3.5)+(B * 7.5)) / 11;
        System.out.println("MEDIA = " + media);
    }
}