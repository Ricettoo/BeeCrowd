import java.util.Scanner;

public class TipoTriangulos{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        double A = Leia.nextDouble();
        double B = Leia.nextDouble();
        double C = Leia.nextDouble();
        Leia.close();

        double menor,meio,maior;

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
       A=maior;
       B=meio;
       C=menor;
        if (A + B <= C || A + C <= B || B + C <= A){
            System.out.println("Nao forma Triangulo");
        }
        else if (Math.pow(A,2)==Math.pow(B,2)+Math.pow(C,2)){
            System.out.println("Forma Triangulo Retangulo");
        }
        else if (Math.pow(A,2)>Math.pow(B,2)+Math.pow(C,2)){
            System.out.println("Forma Triangulo Obtusangulo");
        }
        else if (Math.pow(A,2)<Math.pow(B,2)+Math.pow(C,2)){
            System.out.println("Forma Triangulos Acutangulo");
        }
        else if (A==B && B==C){
            System.out.println("Forma Triangulo Equilatero");
        }
        else if (A == B && B != C || A == C && B != C || B == C && A != B){
            System.out.println("Forma Triangulo Isosceles");
        }

    }
}