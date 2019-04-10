def sumaCantidades():
    global cont, num, sumt
    cont=0
    sumt=0
    while(cont<10):
        num=int(input(f"Ingrese el numero de la poscion {cont}"))
        sumt=sumt+num
        cont=cont+1
    print("La suma de los numeros ingresados es:",sumt)

sumaCantidades()