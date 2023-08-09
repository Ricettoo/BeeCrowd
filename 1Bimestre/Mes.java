import java.util.Scanner;

public class Mes{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        int mes = Leia.nextInt();
        Leia.close();
        
        String nomeMes = "";
        switch(mes){
            case 1:
            nomeMes="Janeiro";
            break;
            case 2:
            nomeMes="Fevereiro";
            case 3:
            nomeMes="marco";
            break;
            case 4:
            nomeMes="Abril";
            break;
            case 5:
            nomeMes="Maio";
            break;
            case 6:
            nomeMes="Junho";
            break;
            case 7:
            nomeMes="Julho";
            break;
            case 8:
            nomeMes="Agosto";
            break;
            case 9:
            nomeMes="Setembro";
            break;
            case 10:
            nomeMes="Outubro";
            break;
            case 11:
            nomeMes="Novembro";
            break;
            case 12:
            nomeMes="Dezembro";
            break;
            default:
            System.out.println("Valor inválido. O valor deve estar entre 1 e 12.");
            return;
        }
        System.out.println(nomeMes);
    }    
}