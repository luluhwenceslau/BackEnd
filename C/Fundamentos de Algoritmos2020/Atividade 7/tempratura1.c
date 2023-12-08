#include <stdio.h>

int dn=0,vetor[12],td=0,t=0,d=1;
float tot=0;

void main (void){
   for(t=0;t<12;t++){
     printf("Digite a temperatura do dia %d: ",d);
     scanf("%d",&vetor[t]);
     d++;
     td=td+vetor[t];
     if(vetor[t]<0){
      dn++;
   }
   }
   tot=(float)td/t;
   printf("\nDias com temperaturas negativas: %d",dn);
   printf("\nMedia da temperatura nesse periodo: %0.2f",tot);
   printf("\nFim do programa.");
}
