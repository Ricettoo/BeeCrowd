import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        int segundos = Leia.nextInt();
        
            int horas = segundos / 3600;
                segundos %= 3600;
        
            int minutos = segundos / 60;
                segundos %= 60;
            
    System.out.printf("%d:%02d:%02d",horas,minutos,segundos);

    Leia.close();
    }
}