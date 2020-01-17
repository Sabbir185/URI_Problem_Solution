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
        int count = 0,sum=0;
        while (true)
        {
            int z = scanner.nextInt();
            if (z <= x) {
                continue;
            }
            else
            {
                for (int i = x; i <z ; i++) {
                    sum = sum+i;
                    count++;
                    if (sum>z)
                    {
                        break;
                    }
                }
            }
            System.out.println(count);
            break;
        }
 
    }
 
}
