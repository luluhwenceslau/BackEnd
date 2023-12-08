//Luana Faxina Wenceslau  RA 120171

#include "TADLista.h"
#include <stdio.h>
#include <stdlib.h>

//INTERCALAR LISTA 1 COM A LISTA 2 GERANDO UMA LISTA 3
void intercala(LISTA *l1, LISTA *l2, LISTA *l3){
    LISTA *aux1, *aux2, *aux3;

    aux1 = l1->inicio;
    aux2 = l1->inicio;
    aux3 = l3->inicio;

    while(aux1 != NULL) && (aux2 != NULL){
        if(l3->inicio == NULL){
            l3->inicio = (NO*)malloc(sizeof(NO));
            aux3 = l3->inicio;
        }
        else{
            aux3->prox = (NO*)malloc(sizeof(NO));
            aux3 = aux3->prox;
        }
        if( aux1->item < aux2->item){
            aux3->item = aux1->item;
            aux1 = aux1->prox;
        }else{
            aux3->item = aux2->item;
            aux2 = aux2->prox;
        }
    }
}
