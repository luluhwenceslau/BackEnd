#include <stdio.h>

float fc(float f){
   return (f-32)/1.8;
}
float cf(float c){
  return (c*1.8)+32;
}

void main(void){
  int i,d,vetort[7],td=0,cd=1,t;
  float m=0;
  printf("Deseja informar a media de temperatura em Celsius(1) ou Fahreinheit(2)? ");
  scanf("%d",&i);
  for(t=0;t<7;t++){
     printf("Digite a temperatura do dia %d: ",cd);
     scanf("%d",&vetort[t]);
     cd++;
     td=td+vetort[t];
  }
  m=(float)td/t;
  printf("\nDeseja iprimir a media de temperatura em Celsius(1) ou Fahreinheit(2)? ");
  scanf("%d",&d);
  if(i==1 && d==1)
    printf("\nMedia da temperatura em Celsius: %.2fC",m);
  else if(i==2 && d==2)
    printf("\nMedia da temperatura em Fahreinheit: %.2fF",m);
  else if(i==1 && d==2)
     printf("\nMedia da temperatura em Fahreinheit: %.2fF",cf(m));
  else if(i==2 && d==1)
     printf("\nMedia da temperatura em Celsius: %.2fC",fc(m));

  printf("\n\nFim do programa.\n\n");
}
