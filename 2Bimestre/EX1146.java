import java.util.Scanner;

public class EX1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X;

        while (true) {
            X = sc.nextInt();
            
            if (X == 0) {
                break;
            }

            for (int i = 1; i <= X; i++) {
                System.out.print(i);

                if (i != X) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
