import java.util.Scanner;

public class TempoEvento{
    public static void main(String[] args) {
    Scanner Leia = new Scanner(System.in);

    //Dia De Inicio
    Leia.next();
    int DiaInicio = Leia.nextInt();

    //Horario Inicio
    int HoraInicio = Leia.nextInt();
    int MinutoInicio = Leia.nextInt();
    int SegundoInicio = Leia.nextInt();

    //Dia de Termino
    Leia.next();
    int DiaFim = Leia.nextInt();

    //Horario De Fim
    int HoraFim = Leia.nextInt();
    int MinutoFim = Leia.nextInt();
    int SegundoFim = Leia.nextInt();

    //calculos em segundos
    int DuracaoSegundos = (DiaFim - DiaInicio) *24 * 60 * 60
    + (HoraFim - HoraInicio)* 60 * 60
    + (MinutoFim - MinutoInicio) * 60
    + (SegundoFim - SegundoInicio);
    Leia.close();

    //calculo em Dia,Hora,Minuto,Segundo
    int dias = DuracaoSegundos / (24 * 60 * 60);
    DuracaoSegundos %= 24*60*60;
    int horas = DuracaoSegundos /(60 * 60);
    DuracaoSegundos %= 60*60;
    int minutos = DuracaoSegundos / 60;
    int segundos = DuracaoSegundos % 60;


System.out.printf("%d dia(s)\n", dias);
        System.out.printf("%d hora(s)\n", horas);
        System.out.printf("%d minuto(s)\n", minutos);
        System.out.printf("%d segundo(s)\n", segundos);
    }
}