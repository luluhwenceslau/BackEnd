#define TAM 10

typedef struct{
    int vetor[TAM];
    int inicio, fim, total;
} FILA;

FILA criar_fila(){
    FILA *fila = (FILA *)malloc(sizeof(FILA));
    if(fila != NULL){
        fila->fim = 0;
        fila->inicio = 0;
        fila->total = 0;
    }
    return fila;
}

int vazia(FILA *fila){
    return (fila->total == 0);
}

int cheia(FILA *fila){
    return (fila->total == TAM);
}

int enfileirar(FILA *fila){
    if(!cheia(fila)){
        fila->vetor[fila->fim] = item;
        fila->fim = (fila->fim + 1) % TAM;
        fila->total + 1;
        return 1;
    }
    return 0;
}

int desenfileirar(FILA *fila){
    if(!vazia(fila)){
        int ret = fila->vetor[fila->inicio];
        fila->inicio = (fila->inicio +1) % TAM;
        fila->total - 1;
        return ret;
    }
    return -999;
}
