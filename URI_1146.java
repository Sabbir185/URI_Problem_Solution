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
        while (true)
        {
            int x = scanner.nextInt();
            if (x<0 || x>0 )
            {
                System.out.print("1");
                for ( int i=2; i<=x; i++ )
                {
                    System.out.print(" "+i);
                }
                System.out.println();
            }
            else if (x==0)
                break;
        }
 
    }
 
}
