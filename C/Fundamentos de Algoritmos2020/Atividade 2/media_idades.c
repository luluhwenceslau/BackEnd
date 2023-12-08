#include <stdio.h>

int s,i,m,c;

void main(void)
{
  s=0;
  m=0;
  c=0;
  while(i<70){
   printf("Digite idades de pessoas ate que chegue em um idoso(maior que 70 anos): \n");
   scanf("%d",&i);
   s=s+i;
   c=c+1;
  }
  c--;
  s=s-i;
  m=s/c;
  printf("\nValor da media das idades(sem idosos): %d\n",m);

}
