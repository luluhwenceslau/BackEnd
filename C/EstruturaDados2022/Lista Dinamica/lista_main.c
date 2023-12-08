#include<stdio.h>
#include"TADlista.c"

int main(){

    LISTA *L1;

    L1 = criar_lista();
    inicializar_lista(L1);
    inserir_aluno(L1);

    return 0;
}
