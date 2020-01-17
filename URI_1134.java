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
        int Alcohol_count=0 ,Gasoline_count=0 ,Diesel_count=0;
        while (true){
            int x = scanner.nextInt();
            if (x==1)
            {
                Alcohol_count++;
            }
            else if (x==2)
            {
                Gasoline_count++ ;
            }
            else if (x==3)
            {
                Diesel_count++ ;
            }
            else if (x==4)
            {
                System.out.println("MUITO OBRIGADO");
                System.out.println("Alcool: "+Alcohol_count);
                System.out.println("Gasolina: "+Gasoline_count);
                System.out.println("Diesel: "+Diesel_count);
                break;
            }
            else
                 continue;
        }
 
    }
 
}
