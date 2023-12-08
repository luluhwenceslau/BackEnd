typedef struct aluno{
    int ra;
    char *nome;
    struct aluno *prox;
}ALUNO;

typedef struct{
    ALUNO *inicio;
    int qtde;
}LISTA;


//Cria um lista
LISTA* criar_lista();

//Inicializa uma lista
void inicializar_lista(LISTA *lista);

//Insere um aluno na lista;
void inserir_aluno(LISTA *lista);

//Imprime uma lista
void imprimir_lista(LISTA *lista);

//Retorna o tamanho da lista
int tamanho_lista(LISTA *lista);

//Compara duas listas
int comparar_listas(LISTA *lista1, LISTA *lista2);

