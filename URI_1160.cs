using System; 

class URI {

    static void Main(string[] args) { 

        int year, PA, PB,T;
        double G1, G2;
        T = int.Parse(Console.ReadLine());
        for (int i = 0; i < T; i++) {

            year = 0;
            // Each test case contain 4 input
            string []n = Console.ReadLine().Split();
            PA = int.Parse(n[0]);
            PB = int.Parse(n[1]);
            G1 = double.Parse(n[2]);
            G2 = double.Parse(n[3]);

            while (PA <= PB) {
                PA = (int) (PA + ((PA * G1) / 100));
                PB = (int) (PB + ((PB * G2) / 100));
                year++;
                if (year > 100) {
                    Console.WriteLine("Mais de 1 seculo.");
                    break;
                }
            }
            if (year <= 100) Console.WriteLine(year + " anos.");
        }

    }

}
