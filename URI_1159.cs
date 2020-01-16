using System; 

class URI {

    static void Main(string[] args) { 

        int sum = 0 ;
        while (true)
        {
            int x = int.Parse(Console.ReadLine());
            if ( x==0 )break;
            else if (x%2==0)
            {
                for (int i = 0; i <5 ; i++) {
                    sum = sum + x ;
                    x+=2;
                }
            }
            else {
                x++;
                for (int k = 0; k <5 ; k++) {
                    sum = sum + x;
                    x+=2;
                }
            }
            Console.WriteLine(sum);
            sum = 0;
        }

    }

}
