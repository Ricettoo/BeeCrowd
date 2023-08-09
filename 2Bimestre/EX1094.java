import java.util.Scanner;

public class EX1094 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCobaias = 0, totalcoelhos = 0, totalsapos = 0, totalratos = 0, X, N;
        double percentualratos = 0, percentualsapos = 0, percentualcoelhos = 0;
        String Animal;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            X = sc.nextInt();
            Animal = sc.next();
            totalCobaias += X;

            if (Animal.equals("C")) {
                totalcoelhos += X;
            } else if (Animal.equals("S")) {
                totalsapos += X;
            } else if (Animal.equals("R")) {
                totalratos += X;
            }
        }

        percentualratos = (double) (totalratos * 100) / totalCobaias;
        percentualcoelhos = (double) (totalcoelhos * 100) / totalCobaias;
        percentualsapos = (double) (totalsapos * 100) / totalCobaias;

        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalcoelhos);
        System.out.println("Total de ratos: " + totalratos);
        System.out.println("Total de sapos: " + totalsapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualcoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualratos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualsapos);

        sc.close();
    }
}
