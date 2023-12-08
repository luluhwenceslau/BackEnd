#include<stdio.h>

int x,y;

void soma(int*s)
{
  s=x+y;
  printf("Soma de %d e %d = %d",x,y,s);
}

void main(void){
  printf("Digite um valor para x: ");
  scanf("%d",&x);
  fflush(stdin);
  printf("Digite um valor para y: ");
  scanf("%d",&y);
  fflush(stdin);
  soma(&x);
}
