#include <stdio.h>

int i,s;

void main(void)
{
  s=0;
  while(i<70) {
  printf("Digite idades de pessoas ate que chegue em um idoso(maior que 70 anos): \n");
  scanf("%d",&i);
  s=s+i;
  }
   s=s-i;
   printf("\nValor da soma das idades(menos dos idosos): %d\n",s);
}
