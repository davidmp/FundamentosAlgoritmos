#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void sumaCantidaddes(void){
	int cont=1;
	float numX,sumT=0;
	while(cont<=10){
		printf("ingrese el numero de la posicion %d :",cont);
		scanf("%f",&numX);
		sumT=sumT+numX;
		cont++;
	}
	printf("La suma de todos los numeros es: %f", sumT);
}

int main(int argc, char** argv) {
	printf("Hola Mundo\n");
	
	printf("Ingrese el numero del algoritmo que desea probar: ");
	int opcion;
	scanf("%d",&opcion);
	while(opcion!=0){
		switch(opcion){
			case 1: sumaCantidaddes(); break;
			case 2: break;
			default : printf("\n Opcion no valida"); break;
		}
		printf("Ingrese el numero del algoritmo que desea probar: ");
		scanf("%d", &opcion);
	}
	return 0;
}
