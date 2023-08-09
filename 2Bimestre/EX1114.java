import java.util.Scanner;

public class EX1114 {
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)) {
            while(true){
                int senha = sc.nextInt();
                if(senha==2002){
                    System.out.println("Acesso Permitido");
                } else {
                    System.out.println("Senha Invalida");
                }
            }
        }
    }
}
