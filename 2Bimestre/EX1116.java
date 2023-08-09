import java.util.Scanner;

public class EX1116 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i<N; i++){
            double X = sc.nextInt();
            double Y = sc.nextInt();
            if ((X/Y)!=0){
                double divisao = X/Y;
                System.out.printf("%.1f",divisao);
            } else {
                System.out.printf("divisao impossivel");
            }
        }
        sc.close();
    }
}
