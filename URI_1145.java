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
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for (int i=1; i<=y; i++ )
        {
            System.out.print(i);
            for (int j = 1; j <= x-1 ; j++) {
                i++;
                System.out.printf(" %d",i);
            }
            System.out.println();
        }
 
    }
 
}
