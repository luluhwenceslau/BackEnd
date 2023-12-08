#include <stdio.h>
#define num_alunos 5

struct alunos{
  int RA;
  char nome[25];
  char curso[20];
  float media;
};

struct alunos aux;
struct alunos vetor_alunos[num_alunos]

char op;
int i=0,cont=1,a=0;

void main(void){
  printf("----------MENU----------");
  printf("\n1) Cadastrar dados");
  printf("\n2) Exbir dados cadastrados");
  printf("\n3) Ordenar dados pelo RA");
  printf("\n4) Gravar dados em arquivo");
  printf("\n5) Ler dados gravados em arquivo");
  printf("\n6) Sair do programa");
  printf("\n\nDigite uma opcao ");
  scanf("%c",&op);
  switch(op)
  {
    case '1':
      for(a=0;a<num_alunos;a++)
      {
        printf("\nDigite o RA do aluno[%d]: ",a+1);
        scanf("%d",&vetor_alunos[a].RA);
        fflush(stdin);
        printf("\nNome: ");
        gets(vetor_alunos[a].nome);
        fflush(stdin);
        printf("\nCurso: ");
        gets(vetor_alunos[a].curso);
        fflush(stdin);
        printf("Media global: ");
        scanf("%f",&vetor_alunos[a].media);
        fflush(stdin);
      }
      break;

    case '2':
      for(a=0;a<num_alunos;a++)
      {
        printf("\nRa:%d ",vetor_alunos[a].RA);
        printf("\nNome:%c ",vetor_alunos[a].nome);
        printf("\nCurso:%c ",vetor_alunos[a].curso);
        printf("\nMedia global:%f ",vetor_alunos[a].media);
        printf("\n----------------------\n");
      }
      break;

    case '3':

      break;

    case '4':
      FILE *fp;

      if ((fp=fopen("arquivo_binario.txt","w+b"))==NULL)
      printf("Arquivo nao pode ser aberto");

      for(i=0;i<alunos;i++)
      {
        printf("Digite um RA: ");
        scanf("%d",&aux.RA);
        fflush(stdin);
        printf("Digite um nome: ");
        gets(aux.nome);
        fflush(stdin);
        printf("Digite o nome do curso: ");
        gets(aux.curso);
        fflush(stdin);
        printf("Digite a media global: ");
        scanf("%f",&aux.media);
        fflush(stdin);

        fwrite(&aux,sizeof(struct aluno),1,fp);
      }
      fclose(fp);
      break;

    case '5':
      FILE *fp;

      if ((fp=fopen("arquivo_binario.txt","r+b"))==NULL)
      printf("Arquivo nao pode ser aberto");

      while (fread(&aux,sizeof(struct aluno),1,fp)!=NULL)
      {
        printf("RA do aluno [%d]: %d \n",cont,aux.RA);
        printf("Nome do aluno [%d]: %s \n",cont,aux.nome);
        printf("Curso do aluno [%d]: %s \n",cont,aux.curso);
        printf("Media global do aluno [%d]: %.1f \n",cont,aux.media);

       cont++;
      }
      fclose(fp);
      break;

    case '6':
      printf("\nPrograma fechado!\n\n");

      break;
  }
}
