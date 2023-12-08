#Programa que lê um ângulo e mostra o valor do seno, cosseno e tangente

from math import radians, sin, cos, tan
an = float(input('Digite um ângulo:'))
sen = sin(radians(an))
cos = cos(radians(an))
tan = tan(radians(an))

print(' ÂNGULO | SENO | COSSENO | TANGENTE  ')
print(f' {an}   | {sen:.2f} |  {cos:.2f}   | {tan:.2f} ')
