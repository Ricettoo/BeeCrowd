import java.util.Scanner;

public class Media3{
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        double N1 = Leia.nextDouble();
        double N2 = Leia.nextDouble();
        double N3 = Leia.nextDouble();
        double N4 = Leia.nextDouble();

        double media = ((N1*2)+(N2*3)+(N3*4)+(N4*1))/10;
        if(media >= 7){
            System.out.println("Aluno aprovado");
            System.out.println("Nota do aluno: "+media);
        }
        if(media <= 5){
            System.out.println("Aluno reprovado");
            System.out.println("Nota do aluno: "+media);
        }
        if(media > 5 && media <= 6.9){
            System.out.println("Aluno em exame");
            System.out.println("Nota do aluno: "+media);
            double N5 = Leia.nextDouble();
            media = (N5+media)/2;
            if (media >= 5){
                System.out.println("Aluno aprovado");
                System.out.println("Nota do exame"+media);
            }
        }
        Leia.close();
    }    
}