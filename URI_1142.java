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
        int count=0;
        for (int i=1; i<=x; i++ )
        {
            for (int j=1;j<=3;j++ )
            {
                    count+=1;
                    System.out.print(count+" ");

            }
            System.out.println("PUM");
            count+=1 ;
        }
 
    }
 
}
