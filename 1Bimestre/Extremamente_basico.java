import java.io.IOException;
import java.util.Scanner;

public class Extremamente_basico {
 
    public static void main(String[] args) throws IOException {
 
 int X;
 Scanner Leia = new Scanner(System.in);
 int A = Leia.nextInt();
 int B = Leia.nextInt();
 Leia.close();
 X = A+B;
 System.out.println(X);
    }
 
}