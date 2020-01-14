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
        float []arr = new float[100];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextFloat();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=10)
            {
                System.out.println("A["+i+"] = "+arr[i] );
            }
        }
 
    }
 
}
