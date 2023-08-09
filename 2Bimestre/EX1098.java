public class EX1098 {
    public static void main(String [] args){
        double I = 0.0;
        double J= 1.0;
        while(I<=2){
            System.out.printf("I= %.1f J= %.1f\n",I,J);
            J +=1;
            System.out.printf("I= %.1f J= %.1f\n",I,J);
            J +=1;
            System.out.printf("I= %.1f J= %.1f\n",I,J);
            J -=1.8;
            I +=0.2;
        }
    }
}
