#include <stdio.h>

int d,continua=1;
float t,m=0,tot=0,mt;

void main(void){
    do{
     printf("\nDigite a temperatura do dia(C):");
     scanf("%f",&t);
     tot=tot+t;
       if (d==0){
          mt=t;
     } else if(t>mt){
         mt=t;
     }
     fflush(stdin);
    d++;
    printf("Deseja continuar? 1(s)/0(n)\n");
    scanf("%d",&continua);
   } while(continua==1);
   printf("\n\nDias:%d",d);
   m=tot/d;
   printf("\nTemperatura media: %.2f",m);
   printf("\nTemperatura mais alta: %.2f",mt);
   printf("\n\nFim do programa.\n\n");
}
