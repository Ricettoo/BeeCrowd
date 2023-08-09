public class EX1096 {
    public static void main(String[] args){
        int I=1,J=7;
        while(I<=9){
            System.out.printf("I= %d J= %d\n",I,J);
            J-=1;
            System.out.printf("I= %d J= %d\n",I,J);
            J-=1;
            System.out.printf("I= %d J= %d\n",I,J);
            J+=2;
            I+=2;

        }
    }
}