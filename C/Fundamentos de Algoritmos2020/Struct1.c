#include <stdio.h>

struct tipo_aluno {
   char nome[20];
   int idade;
   float altura;
   float peso;
   char telefone[18];
   char email[20];
};

struct tipo_aluno variavel_aluno;

void main (void){
   printf("Digite um nome: ");
   gets(variavel_aluno.nome);
   fflush(stdin);
   printf("Digite a altura: ");
   scanf("%f",&variavel_aluno.altura);
   fflush(stdin);
   printf("Digite o peso: ");
   scanf("%f",&variavel_aluno.peso);
   fflush(stdin);
   printf("Digite a idade: ");
   scanf("%d",&variavel_aluno.idade);
   fflush(stdin);
   printf("Digite o telefone: ");
   gets(variavel_aluno.telefone);
   fflush(stdin);
   printf("Digite o email: ");
   gets(variavel_aluno.email);
   fflush(stdin);

   printf("\n\n\n");

   printf("Nome: %s \n",variavel_aluno.nome);
   printf("Altura: %.2f \n",variavel_aluno.altura);
   printf("Peso: %.2f \n",variavel_aluno.peso);
   printf("Idade: %d\n",variavel_aluno.idade);
   printf("Telefone: %s\n",variavel_aluno.telefone);
   printf("Email: %s\n",variavel_aluno.email);
   printf("\n\n");
   printf("Fim do programa.");
}
