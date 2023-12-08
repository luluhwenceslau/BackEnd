#include <stdio.h>

int d=1;
float t,m=0,tot=0,menor,mt;

void main(void){
   for(d=0;d<7;d++)
    {
     printf("Digite a temperatura do dia(C): ");
     scanf("%f",&t);
     tot=tot+t;
       if (d==1){
          mt=t;
     } else if(t>mt){
         mt=t;
     }
     fflush(stdin);
   }
   printf("\nDias:%d",d);
   m=tot/d;
   printf("\nTemperatura media da semana: %.2f",m);
   printf("\nTemperatura mais alta da semana: %.2f",mt);
   printf("\n\nFim do programa.\n\n");
}
