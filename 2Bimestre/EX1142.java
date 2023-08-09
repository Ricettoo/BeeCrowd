import java.util.Scanner;

public class EX1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int contador = 1;

        for (int i = 1; i <= N; i++) {
            System.out.println(contador + " " + (contador + 1) + " " + (contador + 2) + " PUM");
            contador += 4;
        }

        sc.close();
    }
}
