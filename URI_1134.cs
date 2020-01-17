using System; 

class URI {

    static void Main(string[] args) { 

        int Alcohol_count=0 ,Gasoline_count=0 ,Diesel_count=0;
        while (true){
            int x = int.Parse(Console.ReadLine());
            if (x==1)
            {
                Alcohol_count++;
            }
            else if (x==2)
            {
                Gasoline_count++ ;
            }
            else if (x==3)
            {
                Diesel_count++ ;
            }
            else if (x==4)
            {
                Console.WriteLine("MUITO OBRIGADO");
                Console.WriteLine("Alcool: "+Alcohol_count);
                Console.WriteLine("Gasolina: "+Gasoline_count);
                Console.WriteLine("Diesel: "+Diesel_count);
                break;
            }
            else
                 continue;
        }
        Console.Read();

    }

}
