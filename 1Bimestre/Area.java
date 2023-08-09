import java.util.Scanner;

public class Area{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        double A = Leia.nextDouble();
        double B = Leia.nextDouble();
        double C = Leia.nextDouble();
        Leia.close();
        double triangulo;
        triangulo = (A*C)/2;
        double circulo;
        double pi;
        pi=3.14159;
        circulo = pi*Math.pow(C,2);
        double trapezio;
        trapezio = ((A+B)*C)/2;
        double quadrado;
        quadrado = Math.pow(B,2);
        double retangulo;
        retangulo = A*B;
        String resultadoT = String.format("%.3f",triangulo);
        String resultadoC = String.format("%.3f",circulo);
        String resultadoTR = String.format("%.3f",trapezio);
        String resultadoQ = String.format("%.3f",quadrado);
        String resultadoR = String.format("%.3f",retangulo);
        System.out.println("TRIANGULO = " + resultadoT);
        System.out.println("CIRCULO = " + resultadoC);
        System.out.println("TRAPEZIO = " + resultadoTR);
        System.out.println("QUADRADO = " + resultadoQ);
        System.out.println("TRIANGULO = " + resultadoR);
        
    }
}