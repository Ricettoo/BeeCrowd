public class EX1097 {
    public static void main(String args[]){
        int I=1,J=7;
        while(I <= 9 && J <= 15){
            System.out.printf("I= %d J= %d\n",I,J);
            J-=1;
            System.out.printf("I= %d J= %d\n",I,J);
            J-=1;
            System.out.printf("I= %d J= %d\n",I,J);
            J+=4;
            I+=2;

        }
    }
}