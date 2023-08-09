import java.util.Scanner;

public class areadocirculo {
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        double raio = Leia.nextInt();
        Leia.close();
        double pi = 3.14;
        double area;
        area = pi * Math.pow(raio,2);
        System.out.println("A="+area);
    }
}
