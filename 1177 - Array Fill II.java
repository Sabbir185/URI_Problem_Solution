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
        int arr[] = new int[1000];
        int j = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < 1000 ; i++) {
            if (j==n)
            {
                j=0;
            }
            System.out.println("N["+i+"] = "+j);
            j++;
        }
 
    }
 
}
