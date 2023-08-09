import java.util.Scanner;

public class EX1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        int contador = 1;

        for (int i = 1; i <= Y; i++) {
            System.out.print(i);

            if (contador < X) {
                System.out.print(" ");
                contador++;
            } else {
                System.out.println();
                contador = 1;
            }
        }

        sc.close();
    }
}
