#include <stdio.h>

int fat(int x){
   if(x==1 || x==0)
    return 1;
   else
    return x * fat(x-1);
 }
 void main(){
  int n;
  printf("Digite um valor para n: ");
  scanf("%d",&n);

  printf("\nFatorial de N %d",fat(n));
 }
