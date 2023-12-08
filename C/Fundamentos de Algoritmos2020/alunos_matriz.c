#include <stdio.h>

#define linhas 3
#define colunas 3

int nota,aluno;
float matriz[linhas][colunas],tot,m;

void main(void){
  for(aluno=1;aluno<linhas;aluno++)
    for(nota=1;nota<colunas;nota++){
       printf("Digite as notas.Aluno [%d] Notas[%d]: ",aluno,nota);
       scanf("%f",&matriz[aluno][nota]);
    }
    printf("\n\n");
   for(aluno=0;aluno<linhas;aluno++){
    for(nota=0;nota<colunas;nota++){
      printf(" %-3.2f ",matriz[aluno][nota]);
       tot=(float)nota+nota;
    }
     printf("\n");
   }
    for(aluno=1;aluno<linhas;aluno++){
      m=tot/3;
      printf("\nA media do aluno [%d] eh: %.2f",m);
      }
}
