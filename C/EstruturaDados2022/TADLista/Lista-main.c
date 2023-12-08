#include <stdio.h>
#include "TADLista.c"

int main(){

    LISTA *L1;
    int  tempRA;
    char opcao;

    do{
        printf("MENU AGENDA:");
        printf("\n(1) - CRIAR LISTA");
        printf("\n(2) - INSERIR ALUNO");
        printf("\n(3) - REMOVER ALUNO");
        printf("\n(4) - BUSCAR UM ALUNO");
        printf("\n(5) - IMPRIMIR LISTA");
        printf("\n(0) - SAIR DO PROGRAMA");

        printf("\n\n Digite uma opcao: ");
        scanf(" %c", &opcao);

        switch(opcao){
            case '1': L1 = criar_lista();
                    break;
            case '2': inserir_aluno(L1);
                    break;
            case '3': printf("Digite o RA do aluno que deseja remover: ");
                    scanf(" %d", &tempRA);
                    remover_aluno(L1, tempRA);
                    break;
            case '4': printf("Digite o RA do aluno que deseja buscar: ");
                    scanf(" %d", &tempRA);
                    buscar_aluno(L1, tempRA);
                    break;
            case '5': imprimir_lista(L1);
                    break;
            case '0: printf("\n\n SAINDO DO PROGRAMA ... ");

        }
    system("cls");
    }while (opcao != '0');

    return 0;
}
