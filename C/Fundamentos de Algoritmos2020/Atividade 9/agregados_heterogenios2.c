#include <stdio.h>

#define num_carros 30

struct tipo_carro{
      char modelo[20];
      int ano;
      float preco;
      char placa[8];
};

struct tipo_carro vetor_carro[num_carros];
int i,j;

void main (void){
   for(i=0;i<num_carros;i++){
     printf("Carro [%d], modelo: ",i+1);
     gets(vetor_carro[i].modelo);
     fflush(stdin);
     printf("Ano : ");
     scanf("%d",&vetor_carro[i].ano);
     fflush(stdin);
     printf("Preco : ");
     scanf("%f",&vetor_carro[i].preco);
     fflush(stdin);
     printf("Placa : ");
     gets(vetor_carro[i].placa);
     fflush(stdin);
   }
   j=vetor_carro[0].preco;
   for(i=0;i<num_carros;i++){
       if(vetor_carro[i].preco < j)
          j=vetor_carro[i].preco;
      }
   for(i=0;i<num_carros;i++){
    if(j ==vetor_carro[i].preco)
     printf("\nCarro mais barato \nModelo: %s \nAno: %d ",vetor_carro[i].modelo,vetor_carro[i].ano);
   }
   printf("\n\nFim do programa.");
}
