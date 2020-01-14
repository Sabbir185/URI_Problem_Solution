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
        int arr[] = new int[100];
        double n = scanner.nextDouble();
        for (int i = 0; i < 100 ; i++) {
            System.out.printf("N[%d] = %.4f\n",i,n);
            n/=2.0;
        }
 
    }
 
}
