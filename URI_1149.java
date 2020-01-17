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
        int a = sc.nextInt();
        int count=0;
        while (true)
        {
            int n = sc.nextInt();
            if (n>0)
            {
                for (int i = 0; i <n ; i++) {
                    count+=a+i;
                }
                break;
            }else continue;
        }
        System.out.println(count);
 
    }
 
}
