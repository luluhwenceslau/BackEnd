#Programa que lê o comprimento dos catetos e calcula e mostra a hipotenusa

from math import hypot
print('Programa com import de biblioteca')

co = float(input('Comprimento do cateto oposto: '))
ca = float(input('Comprimento do cateto adjacente: '))
hi = hypot(co, ca)
print(f'A hipotenusa vai medir: {hi:.2f}')

'''
print('Programa com método matemático')
co = float(input('Comprimento do cateto oposto: '))
ca = float(input('Comprimento do cateto adjacente: '))
hi = (co ** 2 + ca ** 2) **(1/2)
print(f'A hipotenusa vai medir: {hi:.2f}')

'''