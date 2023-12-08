#include "arvore.h"
#include <stdio.h>
#include<stdlib.h>

#define filho_esq 0
#define filho_dir 1

ARVORE_BINARIA *criar_arvore(){
    ARVORE_BINARIA *arv;
    arv = (ARVORE_BINARIA *)malloc(sizeof(ARVORE_BINARIA));

    if (arv != NULL){
        arv->raiz = NULL;
    }
    return arv;
}
    NO *criar_raiz(ARVORE_BINARIA *arvore, int item){
        arvore->raiz = (NO *)malloc(sizeof(NO));

        if (arvore->raiz != NULL){
            arvore->raiz->filhodir = NULL;
            arvore->raiz->filhoesq = NULL;
            arvore->raiz->item = item;
        }
        return arvore->raiz;
    }



NO *inserir_elementos(int filho, NO *no, int item){
    NO *pnovo = (NO *)malloc(sizeof(NO));

    if (pnovo != NULL){
        pnovo->filhodir = NULL;
        pnovo->filhoesq = NULL;
        pnovo->item = item;

        if (filho == filho_esq){
            no->filhoesq = pnovo;
        }else{
            no->filhodir = pnovo;
        }
    }
    return pnovo;
}

int inserir_aux(NO *raiz, int itemNovo){
    if(raiz->item > itemNovo){
        if (raiz->filhoesq != NULL){
            return inserir_aux(raiz->filhoesq, itemNovo);
        } else{
            return(inserir_elementos(filho_esq, raiz, itemNovo) != NULL);
        }
    } else if(raiz->item < itemNovo){
        if (raiz->filhodir != NULL){
            return inserir_aux(raiz->filhodir, itemNovo);
        } else{
            return(inserir_elementos(filho_dir, raiz, itemNovo) != NULL);
        }
    }else{
        return 0;
    }
}

int inserir(ARVORE_BINARIA *arvore, int itemNovo){
    if(arvore == NULL){
        return (criar_raiz(arvore, itemNovo) != NULL);
    }else {
        return inserir_aux(arvore->raiz, itemNovo);
    }
}

void destruir_arvore_aux(NO *raiz){
    if (raiz != NULL){
        destruir_arvore_aux(raiz->filhoesq);
        destruir_arvore_aux(raiz->filhodir);
        free(raiz);
    }
}

void destruir_arvore(ARVORE_BINARIA *arvore){
    destruir_arvore_aux(arvore->raiz);
    free(arvore);
    arvore = NULL;
}