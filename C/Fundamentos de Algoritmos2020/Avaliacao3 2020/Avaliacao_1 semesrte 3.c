#include <stdio.h>
#define num_alunos 20

char op;
int i=0,cont=1,j,min,auxiliar;
FILE *fp;

struct alunos{
  int RA;
  char nome[20];
  char curso[20];
  float media;
};

struct alunos aux;
struct alunos vetor_alunos[num_alunos];

void imprime_aluno(void)
{
 for(i=0;i<num_alunos;i++)
 {
  printf("RA do aluno [%d]: %d \n",cont,aux.RA);
  printf("Nome do aluno [%d]: %s \n",cont,aux.nome);
  printf("Curso do aluno [%d]: %s \n",cont,aux.curso);
  printf("Media global do aluno [%d]: %.1f \n",cont,aux.media);
  cont++;
 }
}

void cadastro_aluno()
{
 for(i=0;i<num_alunos;i++)
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
 }
}

void main(){
  while(op !=6){
    printf("\n----------MENU----------");
    printf("\n1) Cadastrar dados");
    printf("\n2) Exbir dados cadastrados");
    printf("\n3) Ordenar dados pelo RA");
    printf("\n4) Gravar dados em arquivo");
    printf("\n5) Ler dados gravados em arquivo");
    printf("\n6) Sair do programa");
    printf("\nDigite uma opcao: ");
    scanf("%c",&op);
    printf("\n");
    switch(op){
     case '1':
       cadastro_aluno();
      break;
     case '2':
      imprime_aluno();
      break;
     case '3':
       for(i=0;i<num_alunos-1;i++)
        {
          min=i;
          for(j=i+1;j<num_alunos;j++)
            {
              if (vetor_alunos[j].RA < vetor_alunos[min].RA)
                  min=j;
            }
            auxiliar = vetor_alunos[min].RA;
            vetor_alunos[min].RA = vetor_alunos[i].RA;
            vetor_alunos[i].RA = vetor_alunos[auxiliar].RA;
       }
       imprime_aluno();
      break;
     case '4':
      if ((fp=fopen("arquivo_binario.txt","w+b"))==NULL)
            printf("Arquivo nao pode ser aberto");

         cadastro_aluno();
         fwrite(&aux,sizeof(struct alunos),1,fp);
         printf("Arquivo salvo em binario.");
         fclose(fp);
      break;
     case '5':
      if ((fp=fopen("arquivo_binario.txt","r+b"))==NULL)
        printf("Arquivo nao pode ser aberto");

       while (fread(&aux,sizeof(struct alunos),1,fp)!=NULL)
        {
         imprime_aluno();
        }
        fclose(fp);
       break;
      default:
        printf("\n----OPCAO INVALIDA----\n");
    }
  }
  printf("\nPrograma fechado!\n\n");
  printf("\n\nFim da execucao.\n\n");
}
