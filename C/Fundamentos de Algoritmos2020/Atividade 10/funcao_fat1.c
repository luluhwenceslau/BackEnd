#include <stdio.h>

int fat(int x){
  if(x==1 || x==0)
    return 1;
  else
   return x * fat(x - 1);
 }

void main(void){
  int n,p,c;
  do{
   printf("Digite um valor para N: ");
   scanf("%d",&n);
   printf("Digite um valor para P: ");
   scanf("%d",&p);
  }
  while(n<p);

  c=fat(n)/(fat(p)*(fat(n-p)));

  printf("\nCombinacao de %d,tomados %d a %d igual a: %d.",n,p,p,c);
  printf("\n-----------------------------------------------");
  printf("\nFim do programa.\n\n");
}
