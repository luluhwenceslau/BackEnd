//Luana Faxina Wenceslau   ra 120171

#include <stdio.h>
#include <stdbool.h>

void bubble_sort(int v[], int n) {
    int i, j, aux;
    bool ordenado;
    for (i = 0; i < n-1; i++) {
        ordenado = false;
        for (j = 0; j < n-i-1; j++) {
            if (v[j] > v[j+1]) {
                aux = v[j];
                v[j] = v[j+1];
                v[j+1] = aux;
                ordenado = true;
            }
        }
        if(!ordenado){
            break;
        }

    }
}

int main() {
    int v[] = {58, 30, 25, 15, 22, 11, 44};
    int n = sizeof(v)/sizeof(v[0]);
    bubble_sort(v, n);
    printf("\n\nVetor ordenado: \n\n");
    for (int i=0; i < n; i++) {
        printf("%d ", v[i]);
    }
    return 0;
}
