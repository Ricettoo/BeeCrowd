import java.util.Scanner;

public class EX1115 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int X = sc.nextInt();
                int Y = sc.nextInt();

                if (X > 0 && Y > 0) {
                    System.out.println("Primeiro");
                } else if (X > 0 && Y < 0) {
                    System.out.println("Segundo");
                } else if (X < 0 && Y < 0) {
                    System.out.println("Terceiro");
                } else if (X < 0 && Y > 0) {
                    System.out.println("Quarto");
                } else {
                    System.out.println("Null");
                }
            }
        }
    }
}
