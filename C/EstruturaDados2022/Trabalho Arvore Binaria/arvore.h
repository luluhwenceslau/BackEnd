typedef struct arvore_binaria ARVORE_BINARIA;
typedef struct no NO;
//typedef int ITEM;

struct no{
    int item;
    NO *filhoesq;
    NO *filhodir;
};

struct arvore_binaria{
    NO *raiz;
};

ARVORE_BINARIA *criar_arvore();

NO *inserir_elementos(int filho, NO *no, int item);

void destruir_arvore(ARVORE_BINARIA *arvore);