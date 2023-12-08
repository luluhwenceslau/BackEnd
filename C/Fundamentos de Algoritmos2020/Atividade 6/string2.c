#include <stdio.h>
#include <string.h>

char str[20],str2[20];
int i,f=0;

void main (void){
     printf("Digite uma palavra ou frase(sem espacos):");
     gets(str);
     for(i=strlen(str)-1; i>=0;i--){
        str2[f] = str[i];
        f++;
     }
     str2[f] = '\0';
     printf("O inverso da palavra e: %s",str2);
     if(strcmp(str,str2)==0){
        printf("\nE um palindromo.");
     } else{
        printf("\nNao e um palindromo.");
     }
     printf("\nFim do programa.");
}
