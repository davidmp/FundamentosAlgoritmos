#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void suma10Cantidades(void){
	int inc=1;
	float numX, sumT=0;
	while(inc<=10){
	printf("Ingrese el valor de la posicion %i : ",inc);
	scanf("%f",&numX);
	sumT=sumT+numX;
	inc++;
	}
	printf("La suma de todos los numeros es: %f", sumT);
}

int main(int argc, char** argv) {
	printf("\nINGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR:");
	int opcion;
	scanf("%i",&opcion);
	while(opcion!=0){
		switch(opcion){
			case 1: suma10Cantidades(); break;
			case 2: break;
			default : printf("Opción no válida"); break;
		}
	printf("\nINGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR:");
	scanf("%i",&opcion);	
	}	
	return 0;
}
