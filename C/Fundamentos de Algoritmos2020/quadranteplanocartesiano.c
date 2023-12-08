#include <stdio.h>

int x,y;

void main(void)
{
  printf("Digite o valor de x: ");
  scanf("%d",&x);
  printf("\nDigite o valor de y: ");
  scanf("%d",&y);
  if(x>0 && y>0)
    printf("\nPar no primeiro quadrante.\n");
   else if(x<0 && y>0)
     printf("\nPar no segundo quadrante.\n");
  else if(x<0 && y<0)
    printf("\nPar no terceiro quadrante.\n");
  else if(x>0 && y<0)
   printf("\nPar no quarto quadrante.\n");

}
