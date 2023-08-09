import java.util.Scanner;

public class Media2{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        double A = Leia.nextDouble();
        Double B = Leia.nextDouble();
        Double C = Leia.nextDouble();
        Leia.close();
        double Media;
        Media = ((A*2)+(B*3)+(C*5)) / 10;
        System.out.println("MEDIA = " + Media);
    }
}