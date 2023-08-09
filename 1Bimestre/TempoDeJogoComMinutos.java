import java.util.Scanner;

public class TempoDeJogoComMinutos {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        int HI = Leia.nextInt();
        int HIM = Leia.nextInt();
        int HF = Leia.nextInt();
        int HFM = Leia.nextInt();
        Leia.close();

        int duracaoH,duracaoM;

        if(HI<=HF){
            duracaoH = HF - HI;
        } else {
            duracaoH = 24 - HF + HI;
        }
        if(HIM<=HFM){
            duracaoM = HFM - HIM;
        } else {
            duracaoM = 60 - HFM + HIM;
            duracaoM--;
        }
    System.out.printf("O jogo teve duracao de "+ duracaoH +" Horas e " + duracaoM + " Minutos");
    }
}