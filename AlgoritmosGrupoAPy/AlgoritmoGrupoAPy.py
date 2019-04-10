def suma10Cantidades():
    global inc,numX,sumT
    inc=1
    sumT=0
    while(inc<=10):
        numX=int(input(f"Ingrese el numero de la posicion {inc}:"))
        sumT=sumT+numX
        inc=inc+1
    print("La suma de los 10 valores ingresados es:", sumT)
    
suma10Cantidades()