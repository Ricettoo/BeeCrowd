public class EX1156 {
        public static void main(String[] args) {
            double S = 0.0;
            int denominador = 1;
            
            for (int numerador = 1; numerador <= 39; numerador += 2) {
                S += (double) numerador / denominador;
                denominador *= 2;
            }
            
            System.out.printf("%.2f%n", S);
        }
    }
