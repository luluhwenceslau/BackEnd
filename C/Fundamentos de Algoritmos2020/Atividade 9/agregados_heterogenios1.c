#include<stdio.h>

#define num_alunos 20

struct tipo_aluno
  {
	char nome[30];
	float vetor_notas[4];
  };

struct tipo_aluno vetor_alunos[num_alunos];
int i,j;

void main(void)
  {
    for (i=0;i<num_alunos;i++)
     {
      printf ("Digite o nome do aluno [%d]: ",i+1);
      gets(vetor_alunos[i].nome);
      fflush(stdin);
      printf ("Digite a nota do bimestre 1 do aluno [%d]: ",i+1);
      scanf("%f",&vetor_alunos[i].vetor_notas[0]);
      fflush(stdin);
      printf ("Digite a nota do bimestre 2 do aluno [%d]: ",i+1);
      scanf("%f",&vetor_alunos[i].vetor_notas[1]);
      fflush(stdin);
      printf ("Digite a nota do bimestre 3 do aluno [%d]: ",i+1);
      scanf("%f",&vetor_alunos[i].vetor_notas[2]);
      fflush(stdin);
      printf ("Digite a nota do bimestre 4 do aluno [%d]: ",i+1);
      scanf("%f",&vetor_alunos[i].vetor_notas[3]);
      fflush(stdin);
     }


    printf("\n\n");
    j=vetor_alunos[0].vetor_notas[2];
    for(i=0;i<num_alunos;i++){
           if(vetor_alunos[i].vetor_notas[2] > j){
               j=vetor_alunos[i].vetor_notas[2];
           }
    }
    for(i=0;i<num_alunos;i++){
        if(j == vetor_alunos[i].vetor_notas[2] )
          printf("Aluno com a maior nota no bimestre 3: %s \n",vetor_alunos[i].nome);
    }
    printf("\n\nFim do programa.\n");
}
