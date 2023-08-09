import java.util.Scanner;

public class EX1113 {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            while(true){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
                if(X==Y){
                    System.out.println("");
                } else if(X>Y){
                    System.out.println("DECRESCENTE");
                } else {
                    System.out.println("CRESCENTE");
                }
            }
        }
    }
}