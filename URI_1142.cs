using System; 

class URI {

    static void Main(string[] args) { 

        int x = int.Parse(Console.ReadLine());
        int count=0;
        for (int i=1; i<=x; i++ )
        {
            for (int j=1;j<=3;j++ )
            {
                    count+=1;
                    Console.Write(count+" ");

            }
            Console.WriteLine("PUM");
            count+=1 ;
        }

    }

}
