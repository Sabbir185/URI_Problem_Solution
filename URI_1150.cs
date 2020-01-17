using System; 

class URI {

    static void Main(string[] args) { 

        int x = int.Parse(Console.ReadLine());
        int count = 0,sum=0;
        while (true)
        {
            int z = int.Parse(Console.ReadLine());
            if (z <= x) {
                continue;
            }
            else
            {
                for (int i = x; i <z ; i++) {
                    sum = sum+i;
                    count++;
                    if (sum>z)
                    {
                        break;
                    }
                }
            }
            Console.WriteLine(count);
            break;
        }

    }

}
