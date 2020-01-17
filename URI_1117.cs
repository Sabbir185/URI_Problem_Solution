using System; 

class URI {

    static void Main(string[] args) { 

        float score;
            float avg, count = 0, store = 0;

            while (true)
            {

                score = float.Parse(Console.ReadLine());

                if (score >= 0 && score <= 10)
                {
                    store += score;
                    count++;
                }
                else
                {
                    Console.WriteLine("nota invalida");
                }

                if (count == 2)
                    break;

            }

            avg = store / 2.00f;
            
            Console.WriteLine("media = "+avg.ToString("0.00") );
            Console.Read();

    }

}
