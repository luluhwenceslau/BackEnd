typedef struct lista_dinamica LISTA;
typedef struct NO;

struct NO{
    int item;
    NO *prox;
};

struct lista_dinamica{
    NO *inicio;
};


lista_dinamica* criar_lista();

void inicializar_lista(lista_dinamica *LISTA);

void imprimir_lista(lista_dinamica *LISTA);

void intercala(lista_dinamica *LISTA);
