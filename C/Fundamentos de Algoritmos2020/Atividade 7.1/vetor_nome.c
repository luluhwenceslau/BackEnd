#include <stdio.h>

int i=0;
char vetor_str[10][30];

void main(void){
    for(i=0;i<10;i++){
       printf("Digite um nome: ");
       gets(vetor_str[i]);
    }
    for(i=0;i<10;i++){
        if(vetor_str[i][0]=='c' || vetor_str[i][0]=='C')
            printf("\nO nome %s comeca com a letra c.",vetor_str[i]);
    }
    printf("\n\nFim do programa.\n");
}
