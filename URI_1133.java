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
 
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x>y)
        {
            for( int i=y+1; i<x; i++ )
            {
                if ( i%5==2 || i%5==3 )
                {
                    System.out.println(i);
                }
            }
        }
        else if (x<y)
        {
            for( int i=x+1; i<y; i++ )
            {
                if ( i%5==2 || i%5==3 )
                {
                    System.out.println(i);
                }
            }
        }
 
    }
 
}
