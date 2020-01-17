using System; 

class URI {

    static void Main(string[] args) { 

       String[] var = Console.ReadLine().Split();
            int x = int.Parse(var[0]);
            int y = int.Parse(var[1]);

            for (int i = 1; i <= y; i++)
            {
                Console.Write(i);
                for (int j = 1; j <= x - 1; j++)
                {
                    i++;
                    Console.Write(" "+i);
                }
                Console.WriteLine();
            }
            Console.Read();

    }

}
