typedef struct{
    int topo, anterior;
    int vet[10];
}PILHA;

criar_pilha(){
    PILHA *pilha = (PILHA *)malloc(sizeof(PILHA));
    if(pilha !=NULL)
        pilha->topo = -1;
    return pilha;
}

int empilhar(PILHA *pilha, int item){
    if(!cheia(pilha)){
        pilha->topo++;
        pilha->vetor[pilha->topo] = item;
        return 1;
    }
    return 0;
}

void desempilhar(PILHA *pilha){
    if(!vazia(pilha)){
        int aux

        aux = pilha->vetor[pilha->topo];
        pilha->topo--;
        return aux;
    }
    return -999;
}

void contar_pares(PILHA *pilha, PILHA *pilha2){
   int aux1, aux2;
   int cont = 0;

   while(pilha->topo != -1){
    aux1 = desempilhar(pilha);
    if(aux1%2 == 0)
        cont++;

    empilhar(pilha2, aux1);
   }
   while(pilha2->topo != -1){
    pilha2 = desempilhar(pilha2);
    empilhar(pilha, aux1);
   }
}

