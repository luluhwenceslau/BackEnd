#include<stdio.h>

int fat(int *f){
     return *f * fat(*f - 1);
}

int x;

void main(void){
  printf("Digite um valor para x: ");
  scanf("%d",&x);
  printf("Valor do fatorial de %d: %d",x,fat(x));

}
