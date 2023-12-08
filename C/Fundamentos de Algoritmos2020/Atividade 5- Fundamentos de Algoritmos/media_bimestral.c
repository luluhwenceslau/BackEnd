#include <stdio.h>

int c=1,a=0;
float n1=0,n2=0,n3=0,n4=0,mt=0,notas=0,ma=0,maior=0,medias=0;

void main(void){
    do{
        printf("Digite a nota 1: ");
        scanf("%f",&n1);
        printf("Digite a nota 2: ");
        scanf("%f",&n2);
        printf("Digite a nota 3: ");
        scanf("%f",&n3);
        printf("Digite a nota 4: ");
        scanf("%f",&n4);
        notas=n1+n2+n3+n4;
        ma=notas/4;
        printf("\nMedia desse aluno: %.2f\n",ma);
        if (a==0){
            maior=ma;
        }else if(ma>maior){
            ma=maior;
        }
        a++;
        medias=medias+ma;
        printf("\nQuer continuar? 1(s)/0(n)");
        scanf("%d",&c);
    } while(c==1);
    fflush(stdin);
    mt=(float)medias/a;
    printf("\n\nAlunos na turma: %d",a);
    printf("\nMedia anual da turma: %.2f",mt);
    printf("\nMaior media anual de um aluno: %.2f",maior);
}
