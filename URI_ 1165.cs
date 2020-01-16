using System; 

class URI {

    static void Main(string[] args) { 

        int t = int.Parse( Console.ReadLine() );
        int count,n;
        for (int i = 1; i <= t ; i++) {
            n = int.Parse( Console.ReadLine() );
            count=0 ;
            for (int j = 1; j <= n ; j++) {
                if ( n%j==0 )
                {
                    count++;
                }
            }
            if( count==2 )
                Console.WriteLine(n+" eh primo");
            else
                Console.WriteLine(n+" nao eh primo");
        }

    }

}
