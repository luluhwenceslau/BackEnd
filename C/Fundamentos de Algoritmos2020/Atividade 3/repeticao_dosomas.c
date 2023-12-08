#include <stdio.h>

int s=0,i,c;

void main(void){
  do{
  printf("Digite um numero para i: \n");
  scanf("%d",&i);
  s=s+i;
  printf("Deseja continuar? 1(sim)/0(nao).");
  scanf("%d",&c);
  }
  while(c>0);
  printf("\nSoma de todos os numeros: %d\n",s);
  printf("\nFim do programa.\n");
}
