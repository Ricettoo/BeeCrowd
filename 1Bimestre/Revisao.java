
public class Revisao {
    public static void main(String[] args){
        int resul=0;
        int vezes=0;
        System.out.println("multiplo de 3");
        while(resul<1000){
            resul=3*vezes;
            vezes++;
            System.out.println(resul);
        }
        resul=0;
        vezes=0;
        System.out.println("multiplo de 5");
        while(resul<1000){
            resul=5*vezes;
            vezes++;
            System.out.println(resul);
        }
    }
}