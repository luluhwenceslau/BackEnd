#include <stdio.h>

#define linhas 30
#define colunas 4

int nota,aluno,cont=0,cont2=0;
float matriz[linhas][colunas],media,mediault;

void main(void){
  for(aluno=0;aluno<linhas;aluno++)
    for(nota=0;nota<colunas;nota++){
       printf("Digite as notas.Aluno [%d] Notas[%d]: ",aluno+1,nota+1);
       scanf("%f",&matriz[aluno][nota]);
    }

   mediault=(matriz[linhas-1][0]+matriz[linhas-1][1]+matriz[linhas-1][2]+matriz[linhas-1][3])/4;
   printf("\n\n");

   for(aluno=0;aluno<linhas;aluno++){
    for(nota=0;nota<colunas;nota++){
        media=(matriz[aluno][0]+matriz[aluno][1]+matriz[aluno][2]+matriz[aluno][3])/4;
    }

    if(media>mediault)
        cont2++;
    if(matriz[aluno][2]>=3 && matriz[aluno][2]<=6){
        cont++;
    }

    printf("A media do aluno %d %-3.2f ",media);
    printf("\n");
   }
   printf("\nAlunos com nota maior que 3 e menor que 6: %d",cont);
   printf("\nQuantidades de alunos com media maior que o ultimo: %d",cont2);
}
