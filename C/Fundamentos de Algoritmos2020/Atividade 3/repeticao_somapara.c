#include <stdio.h>

int s=0,i=0,c=1;

void main(void){
   for(i;c>0;s=s+i){
     printf("Digite um valor para i: \n");
     scanf("%d",&i);
     printf("Deseja continuar? 1(sim)/0(nao): ");
     scanf("%d",&c);
  }
  printf("\nValor das somas:%d\n",s);
  printf("\nFim do programa.\n");
}
