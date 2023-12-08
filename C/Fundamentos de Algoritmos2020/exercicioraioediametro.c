#include <stdio.h>

float r,d,c,a;

void main(void)
{
  printf("O VALOR DA CIRCUNFERENCIA");
  printf("\nDigite o valor do raio\n");
  scanf("%f",&r);
  printf("O valor do raio eh:%f\n",r);
  d=r*2;
  printf("\nO valor do diametro eh:%f\n", d);
  c=2*3.14*r;
  printf("\nO valor da circunferencia eh:%f\n",c);
  a=3.14*r*r;
  printf("\nO valor da area eh:%f\n", a);

}
