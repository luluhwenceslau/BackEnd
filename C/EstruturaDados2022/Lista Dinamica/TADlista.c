#include<stdio.h>
#include"TADlista.h"

LISTA* criar_lista(){
    LISTA *aux;
    aux = (LISTA*)malloc(sizeof(LISTA));

    return aux;
}

void inicializar_lista(LISTA *lista)(){
     lista->inicio = NULL;
     lista->qtde = 0;

}

void inserir_aluno(LISTA *lista)(){
    //inserindo unico elemento = lista vazia
    if(lista->inicio == NULL){

       lista->inicio = (struct *aluno)malloc(sizeof(struct aluno));
       printf("\nDigite um RA: ");
       scanf("%d", &(lista->inicio->ra));
       gets(lista->inicio->nome);
       lista->prox = NULL;
       lista->qtde++;
    }
}

void imprimir_lista(LISTA *lista){
    printf("\nA quantidade de alunos na lista eh: %d", lista->qtde);
    printf("\nNome do aluno: %s", lista->inicio->nome);
}

