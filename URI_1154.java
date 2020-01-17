using System; 

class URI {

    static void Main(string[] args) { 

        int x,count=0;
        float avg,sum=0;
        while (true)
        {
            x = int.Parse(Console.ReadLine());
            if ( x>0 )
            {
                sum = sum + x ;
                count++ ;
                continue;
            }
            else break;
        }
        avg = sum/count;
        Console.WriteLine(avg.ToString("F2"));

    }

}
