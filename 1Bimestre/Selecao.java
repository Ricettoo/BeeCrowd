import java.util.Scanner;
public class Selecao{
    public static void main(String args[]){
     Scanner Leia = new Scanner(System.in);
       
        int A = Leia.nextInt();
        int B = Leia.nextInt();    
        int C = Leia.nextInt();
        int D = Leia.nextInt();
        Leia.close();

    if (B>C && D>A && C+D>A+B && C>0 && D>0 && A%2==0){
        System.out.println("Valores aceitos");
    } else {
        System.out.println("Valores nao aceitos");
    }
 }
}