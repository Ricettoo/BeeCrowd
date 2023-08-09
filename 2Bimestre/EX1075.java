import java.util.Scanner;

public class EX1075 {
    public static void main(String[] args){
        Scanner Leia = new Scanner (System.in);
        System.out.println("Digite o valor N");
        int num = Leia.nextInt();
        for(int i = 0; i<10000; i++){
            if(i%num==2){
                System.out.println(i);
            }
        }
        Leia.close();
    }
}