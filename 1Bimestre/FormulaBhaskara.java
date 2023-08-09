import java.util.Scanner;

public class FormulaBhaskara{
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        double A = Leia.nextDouble();
        double B = Leia.nextDouble();
        double C = Leia.nextDouble();
        Leia.close();
        double R1,R2,delta;
    delta = (B*B)-(4*A*C);
    
    if(A==0||delta < 0){
        System.out.println("impossivel calcular");
    }else{
    R1 = (-B + Math.sqrt(delta))/(2*A);
    R2 = (-B - Math.sqrt(delta))/(2*A);
    System.out.println(String.format("R1 = %.5f\nR2 = %.5f", R1, R2));
}
    }
}