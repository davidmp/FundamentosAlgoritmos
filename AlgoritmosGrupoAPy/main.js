function suma10Cantidades(){
    var inc=1;
    var sumT=0, numX;
    while(inc<=10){
    numX=parseInt(prompt("Ingrese el valor de la posicion "+inc,0));
    sumT=sumT+numX;
    inc++;
    }
    document.write("La suma de los 10 valores ingresados es:"+sumT);
    console.log("La suma de los 10 valores ingresados es:"+sumT);
    alert("La suma de los 10 valores ingresados es:"+sumT);
}

suma10Cantidades();