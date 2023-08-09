import java.util.Scanner;

public class SortSimples{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        int A = Leia.nextInt();
        int B = Leia.nextInt();
        int C = Leia.nextInt();
        Leia.close();

        int menor,meio,maior;

        if(A<=B && A<=C){
            menor = A;
            if(B<=C){
                meio = B;
                maior = C;
            } else {
                meio = C;
                maior = B;
            }    
        } else if(B<=A && B<C){
            menor = B;
            if(B<=C){
                meio = A;
                maior = C;
            } else {
                meio = C;
                maior = A;
            }
        } else {
            menor = C;
            if(A<=B) {
                meio = A;
                maior = B;
            } else {
                meio = B;
                maior = A;
            }
        }
        System.out.printf("%d\n%d\n%d\n\n",menor,meio,maior);
        System.out.printf("%d\n%d\n%d\n", A,B,C);
    }
}