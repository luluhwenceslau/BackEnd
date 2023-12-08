frase = 'Curso em Vídeo Python'
print(frase[::2])

#Usar """ (3 aspas) para textos grandes, no inicio e no final do texto, em um unico print

print(frase.count('o')) # conta quantas letras 'o' existem na frase

print(len(frase)) # conta quantos caracteres existem na frase, inclui espaços

frase = frase.replace('Python', 'Android') #Muda o elemento da frase, fazendo atribuição
print(frase.split()) #separa a frase, cada parte recebe um número e podem ser mostrados separados