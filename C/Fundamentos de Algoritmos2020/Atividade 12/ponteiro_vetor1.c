#include <stdio.h>

int d=1,vetor[12],i;

float cf(float c){
  return (c*1.8)+32;
}

void mostra_vetor(int v[], int TAM){
   int i,d=1;
   for (i=0;i<TAM;i++){
     printf("Temperatura dia %d: %dC\n",d,v[i]);
     d++;
   }
  }

void mostra_vetor2(int v[], int TAM){
   int i,d=1;
   for (i=0;i<TAM;i++){
     printf("Temperatura dia %d: %.2fF \n",d,cf(i),v[i]);
     d++;
   }
  }

void main(void){
   for(i=0;i<12;i++){
     printf("Digite a temperatura do dia %d em Celsius: ",d);
     scanf("%d",&vetor[i]);
     d++;
   }
   printf("\n---TEMPERATURA EM CELSIUS---\n");
   mostra_vetor(vetor,12);

   printf("\n---TEMPERATURA EM FAHREINHEIT---\n");
   mostra_vetor2(vetor,12);
}
