import java.util.Scanner;

public class Cedulas{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
     
        int cedula,resto;
        System.out.println("Insira o valor monetario");
        int valor = Leia.nextInt();

        if (valor>= 100){
            cedula = valor / 100;
            resto = valor % 100;
            System.out.println(cedula +"notas de R$100");
            valor=resto;
        }
        if (valor >= 50){
            cedula = valor / 50;
            resto = valor % 50;
            System.out.println(cedula +"notas de R$50");
            valor=resto;
        }
        if (valor>= 20){
            cedula = valor / 20;
            resto = valor % 20;
            System.out.println(cedula +"notas de R$20");
            valor=resto;
        }
        if (valor>= 10){
            cedula = valor / 10;
            resto = valor % 10;
            System.out.println(cedula +"notas de R$10");
            valor=resto;
        }    
        if (valor>= 5){
            cedula = valor / 5;
            resto = valor % 5;
            System.out.println(cedula +"notas de R$5");
            valor=resto;
        }
        if (valor>= 2){
            cedula = valor / 2;
            resto = valor % 2;
            System.out.println(cedula +"notas de R$2");
            valor = resto;
    }
        if (valor>=1){
            cedula = valor / 1;
            resto = valor % 1;
            System.out.println(cedula +"notas de R$1");
            valor = resto;
        }
        Leia.close();
    }
}