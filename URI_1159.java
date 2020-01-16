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
        int sum = 0 ;
        while (true)
        {
            int x = scanner.nextInt();
            if ( x==0 )break;
            else if (x%2==0)
            {
                for (int i = 0; i <5 ; i++) {
                    sum = sum + x ;
                    x+=2;
                }
            }
            else {
                x++;
                for (int k = 0; k <5 ; k++) {
                    sum = sum + x;
                    x+=2;
                }
            }
            System.out.println(sum);
            sum = 0;
        }
 
    }
 
}
