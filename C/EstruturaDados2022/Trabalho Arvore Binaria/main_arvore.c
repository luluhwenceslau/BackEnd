#include "arvore.c"
#include <stdio.h>
#include<stdlib.h>

int main(){
    ARVORE_BINARIA *arvore;

    char opcao;
    int item;

    do{
        printf("MENU AGENDA:");
        printf("\n(1) - CRIAR ARVORE");
        printf("\n(2) - INSERIR ELEMENTOS");
        printf("\n(3) - DESTRUIR ARVORE");
        printf("\n(0) - SAIR DO PROGRAMA");

        printf("\n\n Digite uma opcao: ");
        scanf(" %c", &opcao);

        switch(opcao){
            case '1':arvore = criar_arvore();
                    break;
            case '2': inserir(arvore, item);
                    break;
            case '3': destruir_arvore(arvore);
                    break;
            case '0': printf("\n\n SAINDO DO PROGRAMA ... ");

        }
    system("cls");
    }while (opcao != '0');

    return 0;
}