#include <stdio.h>
 
int main() {
 
    int Alcohol_count=0 ,Gasoline_count=0 ,Diesel_count=0,x;
        while (1){
            scanf("%d\n",&x);
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
                printf("MUITO OBRIGADO\n");
                printf("Alcool: %d\n",Alcohol_count);
                printf("Gasolina: %d\n",Gasoline_count);
                printf("Diesel: %d\n",Diesel_count);
                break;
            }
            else{
                 continue;
            }
        }
 
    return 0;
}
