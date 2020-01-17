using System; 

class URI {

    static void Main(string[] args) { 

        while (true)
        {
            int x = int.Parse(Console.ReadLine());
            if (x<0 || x>0 )
            {
                Console.Write("1");
                for ( int i=2; i<=x; i++ )
                {
                    Console.Write(" "+i);
                }
                Console.WriteLine();
            }
            else if (x==0)
                break;
        }
        Console.Read();

    }

}
