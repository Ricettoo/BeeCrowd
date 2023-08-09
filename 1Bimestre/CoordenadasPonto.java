import java.util.Scanner;

public class CoordenadasPonto{
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        double X = Leia.nextDouble();
        double Y = Leia.nextDouble();
        Leia.close();

        if(X>0 && Y>0){
            System.out.println("Q1");
        }
        if(X>0 && Y<0){
            System.out.println("Q2");
        }
        if(X<0 && Y<0){
            System.out.println("Q3");
        }
        if(X<0 && Y>0){
            System.out.println("Q4");
        }
        if(X==0 & Y==0){
            System.out.println("Origem");
        }
        if(X==0){
            System.out.println("Eixo X");
        }
        if(Y==0){
            System.out.println("Eixo Y");
        }
    }
}