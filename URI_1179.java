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
        int []odd = new int[5];
        int []even = new int[5];
        int n,E=0,O=0;
        for (int i = 0; i < 15 ; i++)
        {
            n = scanner.nextInt();
            if ( n%2==0 )
            {
                even[E] = n ;
                E++ ;
                if ( E==5 )
                {
                    int j=0;
                    for (j = 0; j < 5; j++)
                    {
                        System.out.println("par["+j+"] = "+even[j]);
                        even[j] = 0 ;
                    }
                    E = 0 ;
                }
            }
            else
            {
                odd[O] = n ;
                O++ ;
                if ( O==5 )
                {
                    int k=0;
                    for (k = 0; k < 5; k++)
                    {
                        System.out.println("impar["+k+"] = "+odd[k]);
                        odd[k]= 0;
                    }
                    O = 0 ;
                }
            }
        }
        for (int i = 0; i < 5 ; i++) {
            if ( odd[i] == 0 )break;
            System.out.println("impar["+i+"] = "+odd[i]);
        }
        for (int i = 0; i < 5 ; i++) {
            if ( even[i] == 0 )break;
            System.out.println("par["+i+"] = "+even[i]);
        }
 
    }
 
}
