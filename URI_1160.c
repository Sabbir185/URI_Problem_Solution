#include <stdio.h>

int main() {
	int year, PA, PB,T,i;
        double G1, G2;
        scanf("%d",&T);
        for (i = 0; i < T; i++) {

            year = 0;
   
            scanf("%d %d %lf %lf",&PA,&PB,&G1,&G2);

            while (PA <= PB) {
                PA = (int) (PA + ((PA * G1) / 100));
                PB = (int) (PB + ((PB * G2) / 100));
                year++;
                if (year > 100) {
                    printf("Mais de 1 seculo.\n");
                    break;
                }
            }
            if (year <= 100) printf("%d anos.\n",year);
        }
	return 0;
}
