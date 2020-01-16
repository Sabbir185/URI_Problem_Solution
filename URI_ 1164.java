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
        int t = scanner.nextInt();
        int sum,n;
        for (int i = 1; i <= t ; i++) {
            n = scanner.nextInt();
            sum=0;
            for (int j = 1; j < n ; j++) {
                if ( n%j==0 )
                {
                    sum = sum+j;
                }
            }
            if (sum==n)
                System.out.println(n+" eh perfeito");
            else
                System.out.println(n+" nao eh perfeito");

        }
 
    }
 
}
