import java.util.Scanner;

public class EX1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int grenais = 0;
        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;

        while (true) {
            int golsInter = sc.nextInt();
            int golsGremio = sc.nextInt();

            if (golsInter > golsGremio) {
                vitoriasInter++;
            } else if (golsGremio > golsInter) {
                vitoriasGremio++;
            } else {
                empates++;
            }

            grenais++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            int opcao = sc.nextInt();
            if (opcao == 2) {
                break;
            }
        }

        sc.close();
        
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empates);

        if (vitoriasInter > vitoriasGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriasGremio > vitoriasInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
    }
}
