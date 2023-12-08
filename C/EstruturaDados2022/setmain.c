#include <stdio.h>
#include <stdlib.h>

#include "tadset.c"

int main(){

    CONJUNTO *A, *B, *C;
    int x;

    A = Cria_Conj_Vazio();//recebe um ponteiro para conjunto
    B = Cria_Conj_Vazio(); // outro espaco criado

    Insere(A, 1);
    Insere(A, 3);
    Insere(A, 5);
    Insere(A, 7);

    Insere(B, 0);
    Insere(B, 2);

}

