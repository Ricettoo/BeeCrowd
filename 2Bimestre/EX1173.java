import java.util.Scanner;

public class EX1173 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];
        N[0] = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            N[i] = N[i - 1] * 2;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
        sc.close();
    }

}
