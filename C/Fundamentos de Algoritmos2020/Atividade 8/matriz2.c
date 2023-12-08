#include <stdio.h>

#define linhas 10
#define colunas 10

int l,c,s;
float matriz[linhas][colunas];

void main(void){
  for (l=0;l<linhas;l++)
    for(c=0;c<colunas;c++){
      printf("Digite um valor para a linha[%d], coluna[%d] ",l,c);
      scanf("%f",&matriz[l][c]);
    }
    printf("\n\n");
    for (l=0;l<linhas;l++){
       for(c=0;c<colunas;c++){
           printf(" %-3.1f ",matriz[l][c]);
           if(l<c){
             s=s+matriz[l][c];
        }
      }
       printf("\n");
    }
    printf("\nSoma dos valores abaixo da diagonal principal: %d",s);
    printf("\n\nFim do programa.");
}
