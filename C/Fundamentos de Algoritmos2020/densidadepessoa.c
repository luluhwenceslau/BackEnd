#include <stdio.h>
#include <string.h>

 char nome[30];
 float peso,altura,densidade;

void main(void)
{
   printf("Digite o seu nome:\n");
   gets(nome);
   printf("Digite seu peso:\n");
   scanf("%f",&peso);
  // printf("Seu peso: %f\n",peso);
   printf("Digite sua altura:\n");
   scanf("%f",&altura);
   //printf("Sua altura: %f\n",altura);
   densidade=peso/(altura*altura);
   printf("%s sua densidade corporal eh: %f",nome,densidade);
}
