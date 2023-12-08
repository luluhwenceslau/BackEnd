#include <stdio.h>

float v,h,r;

void main(void)
{
 printf("Volume da Lata");
 printf("\nDidite o raio da lata\n");
 scanf("%f",&r);
 printf("\nO raio eh:%f",r);
 printf("\nA altura da lata:\n");
 scanf("%f",&h);
 printf("\nA altura da lata eh:%f\n",h);
 v=3.14*(r*r)*h;
 printf("\nO volume da lata eh:%f\n",v);

 }
