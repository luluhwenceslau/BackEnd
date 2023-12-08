#include <stdio.h>

int n,i;

void main(void)
{
   i=0;
   printf("Digite um valor para n:\n");
   scanf("%d",&n);
   while(i<=n){
   printf("\n%d",i);
   i=i+2;
   }
   printf("\n\nFim da Execucao.\n");
}
