using System; 

class URI {

    static void Main(string[] args) { 

        int x = int.Parse( Console.ReadLine() );
        int y = int.Parse( Console.ReadLine() );
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
            Console.WriteLine(sum);
        }
        else {

            for ( int i = y; i<= x; i++ )
            {
                if ( i%13 != 0)
                {
                    total+=i;
                }
            }
            Console.WriteLine(total);
        }
        Console.Read();
    }

}
