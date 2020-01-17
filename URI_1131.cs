using System; 

class URI {

    static void Main(string[] args) { 

        int grenais_count = 0, inter_count = 0, gremio_count = 0, draw_count = 0;

            while (true)
            {
                String[] values = Console.ReadLine().Split(' ');
                int n = int.Parse(values[0]);
                int m = int.Parse(values[1]);
                grenais_count++;
                Console.WriteLine("Novo grenal (1-sim 2-nao)");
                if (n > m)
                    inter_count++;
                else if (n < m)
                    gremio_count++;
                else
                    draw_count++;

                int one = int.Parse(Console.ReadLine());
                if (one == 1)
                {
                    continue;
                }
                else if (one == 2)
                {
                    Console.WriteLine(grenais_count+" grenais");
                    Console.WriteLine("Inter:"+inter_count);
                    Console.WriteLine("Gremio:"+gremio_count);
                    Console.WriteLine("Empates:"+draw_count);

                    if (inter_count > gremio_count)
                        Console.WriteLine("Inter venceu mais");
                    else if (inter_count < gremio_count)
                    {
                        Console.WriteLine("Gremio venceu mais");
                    }
                    else if (inter_count == gremio_count)
                        Console.WriteLine("Não houve vencedor");
                    break;
                }
            }
            Console.Read();

    }

}
