#include <stdio.h>

int potencia(int b, int e)
{
    if (e==0)
       return 1;
    else
       return b*potencia(b,e-1);
}

int main(){
  int b,e;
  printf("Digite uma base para a potencia: ");
  scanf("%d",&b);
  printf("Digite o expoente: ");
  scanf("%d",&e);

  printf("\nResultado = %d", potencia(b,e));
  printf("\n\nFim do programa.\n");
}
