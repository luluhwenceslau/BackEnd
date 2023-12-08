#include <stdio.h>

int t,vetor[12],dm,d=1;

void main (void){
    for(t=0;t<12;t++){
      printf("Digite a temperatura do dia %d: ",d);
      scanf("%d",&vetor[t]);
      d++;
    }
    for(t=0;t<12;t++){
     if(vetor[t] > vetor[11]){
         dm++;
      }
    }
    printf("\nDias com temperatura maior que o ultimo dia:%d dia(s)",dm);
    printf("\nFim do programa");
}
