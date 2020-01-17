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
        int sum = 0,total=0;

        if( x<y )
        {
            for ( int i = x; i<= y; i++ )
            {
               if ( i%13 != 0)
               {
                   sum+=i;
               }
            }
            System.out.println(sum);
        }
        else {

            for ( int i = y; i<= x; i++ )
            {
                if ( i%13 != 0)
                {
                    total+=i;
                }
            }
            System.out.println(total);
        }
 
    }
 
}
