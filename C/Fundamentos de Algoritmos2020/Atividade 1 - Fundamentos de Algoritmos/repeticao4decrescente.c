#include<stdio.h>

int n,m;

void main(void)
{
  printf("Digite um valor para n: ");
  scanf("%d",&n);
  printf("\nDigite um valor maior que n para m: ");
  scanf("%d",&m);
  while(n<=m){
    printf("\n%d",m);
    m=m-1;
  }
  printf("\n\nFim da Execucao.\n");
}

