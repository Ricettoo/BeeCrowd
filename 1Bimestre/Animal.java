import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        String A = Leia.next();
        String B = Leia.next();
        String C = Leia.next();
        Leia.close();
        if (A.equals("vertebrado")){
            if (B.equals("ave")){
                if (C.equals("carnivoro")){
                    System.out.println("\naguia");
                }
                if (C.equals("onivoro")){
                    System.out.println("\npomba");
                }
            }
            if (B.equals("mamifero")){
                if (C.equals("onivoro")){
                    System.out.println("\nhomem");
                }
                if (C.equals("herbivoro")){
                    System.out.println("\nvaca");
                }
            }
        }
        if (A.equals("invertebrado")){
            if (B.equals("inseto")){
                if (C.equals("hematofago")){
                    System.out.println("\npulga");
                }
                if (C.equals("herbivoro")){
                    System.out.println("\nlagarta");
                }
            }
            if (B.equals("anelideo")){
                if (C.equals("hematofago")){
                    System.out.println("\nsanguessuga");
                }
                if (C.equals("onivoro")){
                    System.out.println("\nminhoca");
                }   
            }
        }
    }
}