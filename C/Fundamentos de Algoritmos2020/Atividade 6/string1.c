#include <stdio.h>
#include <string.h>

char str[20],l;
int tam,i,nv;

void main(void){
   printf("Digite uma palavra:");
   gets(str);
   printf("\nDigite um caractere da palavra: ");
   scanf("%c",&l);
   tam=strlen(str);
   for(i=0;i<tam;i++){
      printf("%c ",str[i]);
       if(str[i]==l){
        nv++;}
   }
   printf("\nNumero de vezes que o caractere '%c' aparece: %d",l,nv);
   printf("\nFim do programa.");
}
