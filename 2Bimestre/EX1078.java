import java.util.Scanner;

public class EX1078 {
    public static void main(String[] args){
        Scanner Leia = new Scanner (System.in);
        System.out.println("Digite o numero a ser multiplicado");
        int num = Leia.nextInt();

        for(int i = 0; i<=10; i++){
            int multi = num * i;
            System.out.println(i +" X "+num+" = "+multi);
        }
        Leia.close();
    }
    
}
