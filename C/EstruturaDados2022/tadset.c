#include <stdio.h>
#include <stdlib.h>

#include "tadsetconjuntos.h"

CONJUNTO *Cria_Conj_Vazio(){
    CONJUNTO *conj //ponteiro local

    conj = (CONJUNTO*) malloc (sizeof(CONJUNTO)); //Alocacando um espaco na ram(endereco valido) do tipo CONJUNTO
    if (conj == NULL){
        printf("Memoria insuficiente\n");
        exit(1);
    }
    conj -> tam = 0;          //-> para acessar a area apontada por um ponteiro
    conj -> v = (int *) malloc (10*sizeof(int)); //especifica o endereco para 10 posicoes de inteiro

    if (conj->v == NULL){
        printf("Memoria insuficiente\n");
        exit(1);
    }

    for (int i =0, i<10, i++){
        conj -> v[i] = 0;
    }
    return conj; // se nao retornar e sair da funcao, perdemos o espaco

bool Insere(CONJUNTO *conj, int valor){

    if(conj->v[valor] == 0){
        conj->v[valor] = 1;
        conj->tam = conj->tam +1;
    }
    return true;
 }

 bool Imprime(CONJUNTO *conj){
    if (conj-> tam == 0){
        printf("CONJUNTO VAZIO\n");
        return false;
    }

    printf("%d elementos \n", conj->tam);
    for(int i=0; i<10; i++){
        if(conj->v[i] == 1)
            printf("%d -", i);
    }
    printf("\n");
    return true;
 }
}
