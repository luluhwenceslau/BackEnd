#include<stdio.h>

int x1,x2,y1,y2,d;

int distancia(int d){
   d=sqrt((x1-x2)+(y1-y2));
   printf("Distancia entre os pares: %d",d);
}

void main(void){
   printf("Digite a cordenada x1: ");
   scanf("%d",&x1);
   fflush(stdin);
    printf("Digite a cordenada x2: ");
   scanf("%d",&x2);
   fflush(stdin);
   printf("Digite a cordenada y1: ");
   scanf("%d",&y1);
   fflush(stdin);
   printf("Digite a cordenada y2: ");
   scanf("%d",&y2);
   fflush(stdin);
   distancia(d);
}
