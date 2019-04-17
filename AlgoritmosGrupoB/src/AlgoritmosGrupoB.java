
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Docente
 */
public class AlgoritmosGrupoB {

    /**
     * @param args the command line arguments
     */
    public static void determiarSueldoSemanalTrabaj(){
    int horasT, cantTrabajador;
    double sueldoH,sueldoSemanal, sueldoBruto=0;
    String nombreT;
    Scanner leer=new Scanner(System.in);
    
    System.out.println("Ingrese la Cantidad de Trabajadores :");
    cantTrabajador=leer.nextInt();
    
    for(int cont=1; cont<=cantTrabajador; cont++){
        System.out.println("Ingrese el nombre del Trabajador "+cont+":");
        nombreT=leer.next();
        do{
        System.out.println("Ingrese la cantidad de horas trabajadas x semana del trabajador "+cont+":");
        horasT=leer.nextInt();
        }while(horasT<=0 || horasT>40);        
        System.out.println("Ingrese el sueldo x hora del trabajador "+cont+":");
        sueldoH=leer.nextDouble(); 
        sueldoBruto=sueldoH*horasT;
        
        if(sueldoBruto<150){
        sueldoSemanal=sueldoBruto-sueldoBruto*0.05;
        }else if(sueldoBruto>=150 && sueldoBruto<300){
        sueldoSemanal=sueldoBruto-sueldoBruto*0.07;
        }else if(sueldoBruto>=300 && sueldoBruto<450){
        sueldoSemanal=sueldoBruto-sueldoBruto*0.09;
        }else{
        sueldoSemanal=sueldoBruto;
        }        
        System.out.println("Nombre de Trabajador "+cont+" :"+nombreT);
        System.out.println("Horas trabajadas del Trabajador "+cont+" :"+horasT);
        System.out.println("Sueldo x Hora del Trabajador "+cont+" :"+sueldoH);
        System.out.println("El sueldo Semanal del trabajador "+cont+" :"+sueldoSemanal);
        System.out.println("");
    }
    
    }
    public static void sumaCantidades(){
        int cont=1;//Inicializando valores
        double num,sumt=0;
        Scanner leer=new Scanner(System.in);        
        while(cont<=10){
            System.out.println("Ingrese el numero de la Posición "+cont);
            num=leer.nextDouble();
            sumt=sumt+num;
            cont++;
        }
        System.out.println("La suma de todos los numeros es:"+sumt);
    }
    public static void sumaCantidadesOpcion2(){
        int cont=1;
        double num, sumt=0;
        Scanner leer=new Scanner(System.in);
        do{
            System.out.println("Ingrese el numero de la Posición "+cont);
            num=leer.nextDouble();
            sumt=sumt+num;
            cont++;
        }while(cont<=10);
        System.out.println("La suma de todos los numeros es:"+sumt);
    }
    public static void sumaCantidadesOpcion3(){
        double num, sumt=0;
        Scanner leer=new Scanner(System.in);
        for(int cont=1; cont<=10;cont++){
            System.out.println("Ingrese el numero de la Posición "+cont);
            num=leer.nextDouble();
            sumt=sumt+num;            
        }
        System.out.println("La suma de todos los numeros es:"+sumt);
    }

    public static void costoPorLlamada(){
        // Definir variables segun tipo de datos
        int ti;
        String di, tu;
        double st,imp,tp;
        System.out.println("Ingrese la Cantidad de Minutos:");
        Scanner leerT=new Scanner(System.in);
        ti=leerT.nextInt();    //Leendo del Teclado como valor entero    
        System.out.println("Ingrese el día de la llamada:");
        di=leerT.next();//Leendo del Teclado como Cadena o texto
        System.out.println("Ingrese el turno de la llamada:");
        tu=leerT.next();   
        //Proceso
        if(ti<=5){
            st=ti*1;
        }else if(ti<=8){
            st=(ti-5)*0.80+5;
        }else if(ti<=10){
            st=(ti-8)*0.70+7.4;
        }else{
            st=(ti-10)*0.50+8.8;
        }
        
        if(di.toLowerCase().equals("domingo")){//toLowerCase convierte a Minuscula, equals compara cadenas
            imp=st*0.03;
        }else{
            if(tu.equalsIgnoreCase("matutino")){
                imp=st*0.15;
            }else{
                imp=st*0.10;
            }
        }
        tp=st+imp;
        System.out.println("El subtotal de la llamada es: "+st+ " Dolares");
        System.out.println("El impuesto a pagar es: "+imp+ " Dolares");
        System.out.println("El total pago por el servicio es: "+tp+ " Dolares");
        
        System.out.println("La llamada se hizo en el día: "+di);
        System.out.println("La llamada se hizo en el turno: "+tu);  
        
          
    }
    
    public static void main(String[] args) {
        System.out.println("Ingrese el numero del Algoritmo que desea probar");
        Scanner leer=new Scanner(System.in);
        int opcion=leer.nextInt();
        while (opcion!=0){            
            switch(opcion){
             case 1: { sumaCantidades(); break; }
             case 2: { costoPorLlamada(); break;}   
             case 3: { sumaCantidadesOpcion2(); break;}
             case 4: { sumaCantidadesOpcion3(); break;}
             case 5: { determiarSueldoSemanalTrabaj(); break;}
             default:{System.out.println("Opción no Valida"); break;}
            }

            System.out.println("Ingrese el numero de algoritmo que desea probar:");
            opcion=leer.nextInt();
        }               
    }
    
}
