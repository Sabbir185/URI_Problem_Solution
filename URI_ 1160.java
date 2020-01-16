import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        int year, PA, PB,T;
        double G1, G2;
        T = scanner.nextInt();
        for (int i = 0; i < T; i++) {

            year = 0;
            // Each test case contain 4 input
            PA = scanner.nextInt();
            PB = scanner.nextInt();
            G1 = scanner.nextDouble();
            G2 = scanner.nextDouble();

            while (PA <= PB) {
                PA = (int) (PA + ((PA * G1) / 100));
                PB = (int) (PB + ((PB * G2) / 100));
                year++;
                if (year > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }
            if (year <= 100) System.out.println(year + " anos.");
        }
 
    }
 
}
