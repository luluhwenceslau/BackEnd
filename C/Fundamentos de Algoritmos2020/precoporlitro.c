#include <stdio.h>

char op;
float g,a,d,t;

void main(void)
{
  printf("Escolha um combustivel:  \n");
  printf("1 - Gasolina____R$1.20 p/litro.\n");
  printf("2 - Alcool______R$0.70 p/litro.\n");
  printf("3 - Diesel______R$0.60 p/litro.\n");
  op=getchar();
  switch(op)
  {
    case'1':
       printf("Voce escolheu a Gasolina.\n");
       printf("Digite quantos litros voce quer: \n");
       scanf("%f",&g);
       t=g*1.2;
       printf("Total a pagar: R$%.2f\n",t);
      break;
    case'2':
        printf("Voce escolheu o Alcool.\n");
        printf("Digite quantos litros voce quer: \n");
        scanf("%f",&a);
        t=a*0.7;
        printf("Total a pagar: R$%.2f\n",t);
      break;
    case'3':
        printf("Voce escolheu o Diesel.\n");
        printf("Digite quantos litros voce quer: \n");
        scanf("%f",&d);
        t=d*0.6;
        printf("Total a pagar: R$%.2f\n",t);
      break;
  }
   printf("\nFim da execucao!!!.");
}
