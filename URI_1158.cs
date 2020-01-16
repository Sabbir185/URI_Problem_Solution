using System; 

class URI {

    static void Main(string[] args) { 

        int m = int.Parse(Console.ReadLine());
        int sum = 0;
        for (int i = 0; i < m; i++) {
            
            string []n = Console.ReadLine().Split();
            int x = int.Parse(n[0]);
            int y = int.Parse(n[1]);
            
            if (x % 2 == 1) {
                for (int j = 0; j < y; j++) {
                    sum = sum+x;
                    x+=2;
                }
            }
            else {
                x++;
                for (int j = 0; j < y; j++) {
                    sum = sum+x;
                    x+=2;
                }
            }
            Console.WriteLine(sum);
            sum = 0 ;
        }

    }

}
