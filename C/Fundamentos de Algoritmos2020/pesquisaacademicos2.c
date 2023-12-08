#include <stdio.h>
#include <math.h>

int i,d=1,x=0,g=0,mulher=0,homen=0,sexo=0,ng;
float p;

void main(void){
  do{
    printf("Qual o sexo do academico? M(1)/F(2):");
    scanf("%d",&sexo);
     if(sexo<=1){
        homen++;
     }
     else {
        mulher++;
     }
    printf("\nQual a idade do academico?:");
    scanf("%d",&i);
    printf("\nGosta do curso que esta fazendo? s(1)/n(0):");
    scanf("%d",&g);
     if(i<23 && g==0 && sexo==1){
        x++;
     }
     if (i>=19 && i<=21 && g==1 && sexo ==2){
        ng++;
     }
    fflush(stdin);
    printf("\nDeseja continuar a pesquisa? 1(sim)/0(nao):\n");
    scanf("%d",&d);
  }
  while(d>0);
  fflush(stdin);
  p=(float)(homen+mulher);
  p=(mulher/p)*100;
  printf("\nNumero de homens entrevistados: %d",homen);
  printf("\nNumero de mulheres entrevistdadas: %d",mulher);
  printf("\nPercentual de mulheres entrevistadas: %.2f",p);
  printf("\nMulheres entre 19 e 21 anos que gostam do curso: %d",ng);
  printf("\nHomens com menos de 23 anos que nao gostam do curso: %d",x);
  printf("\n\nFim do programa.");
}
