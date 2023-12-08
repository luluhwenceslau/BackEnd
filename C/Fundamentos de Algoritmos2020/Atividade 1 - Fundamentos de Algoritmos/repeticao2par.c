#include <stdio.h>

int n,i;

void main(void)
{
   i=1;
   printf("Digite um valor para n:\n");
   scanf("%d",&n);
   i--;
   while(i<=n){
     printf("\n%d",i);
     i=i+5;
   }
   printf("\n\nFim da Execucao.\n");
}
