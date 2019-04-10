def sumaCantidades():
    global cont, num, sumt #global: es para definir el tipo de funcionamiento de la varibale en todo el archivo
    cont=0 #inicializando valores
    sumt=0
    while(cont<10):
        num=int(input(f"Ingrese el numero de la poscion {cont}"))
        sumt=sumt+num
        cont=cont+1
    print("La suma de los numeros ingresados es:",sumt)

def tablamultiplicar1a10():
    for numI in range(1,11):
        for numF in  range(1,11):
            print(numI,"x", numF, "=", numI*numF)
        print("\n")

def main(opcion):
    switcher={
        1: tablamultiplicar1a10(),
        2: sumaCantidades()
    }
    func=switcher.get(opcion,"no existe")
    return func

opcion=int(input("Ingrese el numero del algoritmo que desea probar :"))
while(opcion!=0):    
    if opcion==1:
        tablamultiplicar1a10()
    else:
        sumaCantidades()    
    opcion=int(input("Ingrese el numero del algoritmo que desea probar :"))