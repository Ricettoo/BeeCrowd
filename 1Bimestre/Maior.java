import java.io.IOException;
import java.util.Scanner;

public class Maior{

    public static void main(String[] args) throws IOException{

        Scanner Leia = new Scanner(System.in);

        int a,b,c;

        a = Leia.nextInt();
        b = Leia.nextInt();
        c = Leia.nextInt();
        Leia.close();

        int maiorAB = (a + b + Math.abs(a-b))/2;
        int maiorC = (maiorAB + c + Math.abs(maiorAB - c))/2;

        System.out.printf(maiorC+" eh o maior");
    }
}

