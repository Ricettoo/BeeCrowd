import java.util.Scanner;

public class TempoDeJogo{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        int HI = Leia.nextInt();
        int HF = Leia.nextInt();
        Leia.close();

        int duracao;

        if (HI<=HF){
            duracao = HF-HI;
        } else {
            duracao = 24-HI+HF;
        }
    System.out.printf("O jogo durou "+ duracao +" Hora(s)");
    }
}