#include <stdio.h>

float s,b,a;

void main(void)
{
 printf("LOSANGO");
 printf("\nDe o valor da diagonal maior do losango\n");
 scanf("%f",&b);
 printf("\nO valor da diagonal maior: %f\n",b);
 printf("\nDe o valor da diagonal menor\n");
 scanf("%f",&s);
 printf("\nO valor da diagonal menor eh: %f\n",s);
 a=(b*s)/2;
 printf("\nA area do losango eh: %f\n",a);

}
