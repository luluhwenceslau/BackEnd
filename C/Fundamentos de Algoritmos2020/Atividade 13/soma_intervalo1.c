#include <stdio.h>
#include <stdlib.h>

int soma_intervalo(int i, int j, int k)
{
  int soma=0;
  if(i<j){
    soma = i + soma_intervalo(i+k,j,k);
  }
  else{
    soma = soma + j;
  }
}

int main(){
  int i,j,k;
  printf("Digite o inicio do intervalo: ");
  scanf("%d",&i);
  printf("Digite o fim do intervalo: ");
  scanf("%d",&j);
  printf("Digite o intervalo entre os numeros: ");
  scanf("%d",&k);

  printf("\n\nSoma = %d", soma_intervalo(i,j,k));
  printf("\n\nFim do programa.\n");

  return EXIT_SUCCESS;
}
