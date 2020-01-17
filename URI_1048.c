#include<stdio.h>
int main()
{
 float input;
 scanf("%f", &input);
 if (input <= 400.0)
   printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %%\n", input * 1.15, input * 0.15);
 else if (input <= 800.0)
   printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %%\n", input * 1.12, input * 0.12);
 else if (input <= 1200.0)
   printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %%\n", input * 1.10, input * 0.10);
 else if (input <= 2000.0)
   printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %%\n", input * 1.07, input * 0.07);
 else
   printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %%\n", input * 1.04, input * 0.04);
 return 0;
}
