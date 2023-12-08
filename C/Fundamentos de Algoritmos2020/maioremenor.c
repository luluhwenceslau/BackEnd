#include <stdio.h>

int x,y,z;

void main (void)
{
  printf("Digite um valor para x:");
  scanf("%d",&x);
  printf("\nDigite um valor para y:");
  scanf("%d",&y);
  printf("\nDigite um valor para z:");
  scanf("%d",&z);
  if(x>y && x>z)
    printf("X eh o maior valor.\n");
  else if(x<y && x<z)
     printf("X eh o menor valor.\n");
  else if(y>x && y>z)
     printf("Y eh o maior valor\n");
  else if(y<x && y<z)
    printf("Y eh o menor valor.\n");
  else if(z>x && z>y)
     printf("Z eh o maior valor.\n");
  else(z<x && z<y);
     printf("Z eh o menor valor.");

}
