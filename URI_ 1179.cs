using System; 

class URI {

    static void Main(string[] args) { 

        int []odd = new int[5];
        int []even = new int[5];
        int n,E=0,O=0;
        for (int i = 0; i < 15 ; i++)
        {
            n = int.Parse(Console.ReadLine());
            if ( n%2==0 )
            {
                even[E] = n ;
                E++ ;
                if ( E==5 )
                {
                    int j=0;
                    for (j = 0; j < 5; j++)
                    {
                        Console.WriteLine("par["+j+"] = "+even[j]);
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
                        Console.WriteLine("impar["+k+"] = "+odd[k]);
                        odd[k]= 0;
                    }
                    O = 0 ;
                }
            }
        }
        for (int i = 0; i < 5 ; i++) {
            if ( odd[i] == 0 )break;
            Console.WriteLine("impar["+i+"] = "+odd[i]);
        }
        for (int i = 0; i < 5 ; i++) {
            if ( even[i] == 0 )break;
            Console.WriteLine("par["+i+"] = "+even[i]);
        }

    }

}
