
typedef struct aluno {
    int ra;
    char *nome;
    struct aluno *prox;
};

typedef struct {
    struct aluno *inicio;
    int qtde;
}LISTA;


//declarando as operações

LISTA* criar_lista();

void inicializar_lista(LISTA *lista);

void inserir_aluno(LISTA *lista);

void imprimir_lista(LISTA *lista);

