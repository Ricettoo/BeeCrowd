import java.util.Scanner;

public class EX1117 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double nota = sc.nextDouble();
       if(nota<=10 && nota>=0){
        System.out.printf("Digite a segunda nota:\n");
        double nota2 = sc.nextDouble();
        double media = (nota+nota2)/2;
        System.out.printf("Media = %.1f",media);
       } else {
        System.out.printf("Nota Invalida");
       }
       sc.close();
    }
    
}
