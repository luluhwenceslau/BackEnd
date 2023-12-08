#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include "TADLista.h"

//Cria um lista
LISTA* criar_lista(){
    LISTA *aux;
    aux = (LISTA*)malloc(sizeof(LISTA));

    return aux;
}

//Inicializa uma lista
void inicializar_lista(LISTA *lista){
    lista->inicio = NULL;
    lista->qtde = 0;
}

//Insere um aluno na lista;
void inserir_aluno(LISTA *lista){

    //inserção do único elemento da lista
    if (lista->qtde == 0){ //verifica se a lista está vazia
        lista->inicio = (ALUNO*) malloc(sizeof(ALUNO));

        printf("\nDigite um nome: ");
        gets(lista->inicio->nome);

        printf("\nDigite um RA: ");
        scanf(" %d", &(lista->inicio->ra));

        lista->inicio->prox = NULL;
    }
    else{
        ALUNO *novo, *aux1, *aux2;

        //Alocação de um novo elemento para ser inserido
        novo = (ALUNO*)malloc(sizeof(ALUNO));

        printf("\nDigite um nome: ");
        gets(novo->nome);
        printf("\nDigite um RA: ");
        scanf(" %d", &(novo->ra));
        novo->prox = NULL;

        //Inserção na primeira posição da lista
        if (novo->ra < lista->inicio->ra){
            novo->prox = lista->inicio;
            lista->inicio = novo;
            novo = NULL;
        }
        else{ //Inserção no meio e final da lista
            aux1 = lista->inicio;
            while((aux1 != NULL) && (aux1->ra < novo->ra)){
                aux2 = aux1;
                aux1 = aux1->prox;
            }

            aux2->prox = novo;
            novo->prox = aux1;
            novo = NULL;
        }
    }
    lista->qtde++;
}

//Imprime uma lista
void imprimir_lista(LISTA *lista){
    struct aluno *aux;

    aux = lista->inicio;
    if (aux == NULL){
        printf("Lista vazia!!!");
    }
    else{
        while(aux != NULL){
            printf("\n\nRA: %d", aux->ra);
            printf("\nNome: %s", aux->nome);
            aux = aux->prox;
        }
    }
}

//Retorna o tamanho da lista
int tamanho_lista(LISTA *lista){

    return lista->qtde;
}
/*
//Compara duas listas
int Comparar_listas(LISTA *lista1, LISTA *lista2){




}
*/
// COPIAR LISTA DE L1 PARA L2(sem repetir os valores)
void copiar_lista(LISTA *lista1, LISTA *lista2){
    ALUNO *aux1, *aux2, *aux3;

    if(lista1->inicio == NULL)
        printf("Lista 1 esta vazia"\n);
    else{ //copiar primeiro elemento
        lista2->inicio = (ALUNO*)malloc(sizeof(ALUNO));
        lista2->inicio->ra = lista1->inicio->ra;

        aux1 = lista1->inicio->prox;
        aux2 = lista2->inicio;

        while(aux1 != NULL){

            aux3 = lista2->inicio;
            while(aux3 != NULL) &&(aux3->ra != aux1->ra)
                aux3 = aux3->prox;

            if(aux3 == NULL){
                aux2->prox = (ALUNO*)malloc(sizeof(ALUNO));
                aux2 = aux2->prox;
                aux2->ra = aux1->ra;
            }
            aux1 = aux1->prox;
        }
    }
}

//INTERCALAR LISTA 1 COM A LISTA 2 GERANDO UMA LISTA 3
void merge(LISTA *lista1, LISTA *lista2, LISTA *lista3){
    ALUNO *aux1, *aux2, *aux3;

    aux1 = lista1->inicio;
    aux2 = lista1->inicio;
    aux3 = lista3->inicio;

    while(aux1 != NULL) && (aux2 != NULL){
        if(lista3->inicio == NULL){
            lista3->inicio = (ALUNO*)malloc(sizeof(ALUNO));
            aux3 = lista3->inicio;
        }
        else{
            aux3->prox = (ALUNO*)malloc(sizeof(ALUNO));
            aux3 = aux3->prox;
        }
        if( aux1->ra < aux2->ra){
            aux3->ra = aux1->ra;
            aux1 = aux1->prox;
        }else{
            aux3->ra = aux2->ra;
            aux2 = aux2->prox;
        }
    }

    while(aux1 != NULL){
        if(lista3->inicio == NULL){
            lista3->inicio = (ALUNO*)malloc(sizeof(ALUNO));
            aux3 = lista3->inicio;
        }
        else{
            aux3->prox = (ALUNO*)malloc(sizeof(ALUNO));
            aux3 = aux3->prox;
        }
        aux3->ra = aux1->ra;
        aux1 = aux1->prox;
    }

    while(aux2 != NULL){
        if(lista3->inicio == NULL){
            lista3->inicio = (ALUNO*)malloc(sizeof(ALUNO));
            aux3 = lista3->inicio;
        }
        else{
            aux3->prox = (ALUNO*)malloc(sizeof(ALUNO));
            aux3 = aux3->prox;
        }
        aux3->ra = aux2->ra;
        aux2 = aux2->prox;
    }
}


//inverte elementos da lista 1 na lista 2
void inverter(LISTA *lista1, LISTA *lista2){
    ALUNO *aux1, *aux2;

}


//remover ra = valor
void remove(LISTA *lista, int valor){
    LISTA *aux, *aux2;

    aux = lista->inicio;
    while(aux != NULL){
        if(aux->ra == valor){
            if(aux->prox == NULL){
                aux->ant->prox = aux->prox;
                free(aux);
                aux = NULL;
            } else if(aux == lista->inicio){
                lista->inicio = lista->inicio->prox;
                lista->inicio->ant = NULL;
                free(aux);
                aux = lista->inicio;
            }else{
            aux->ant->prox = aux->prox;
            aux->prox->ant = aux->ant;
            aux2 = aux;
            aux = aux->prox;
            free(aux2);
            }
        }
        else
            aux = aux->prox;
    }
}
