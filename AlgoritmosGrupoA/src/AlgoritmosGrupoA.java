
import java.util.Scanner;

public class AlgoritmosGrupoA {

   public static void suma10Cantidades(){
       int inc=1;//Definir Variables e inicialiar valores
       double numX, sumT=0;
       //Proceso
       Scanner leer=new Scanner(System.in);
       while(inc<=10){
           System.out.println("Ingrese el valor de la Posición: "+inc);
           numX=leer.nextDouble();
           sumT=sumT+numX;
           inc++;
       }
    System.out.println("La suma de los 10 valores ingresados es:"+sumT);
   }
   
   public static void sumaCantidadForma2(){
        int inc=1; 
        double numX, sumT=0;
        Scanner leer=new Scanner(System.in);
        do{
          System.out.println("Ingrese el numero de la posicion "+inc);
          numX=leer.nextDouble();
          sumT=sumT+numX;
          inc++;
          
        } while(inc<=10);
        System.out.println("La suma de los numeros es:"+sumT);
   }
   public static void sumaCantidadForma3(){
       double numX, sumT=0;
       Scanner leer=new Scanner(System.in);
       for(int inc=1;inc<=10;inc++){
       System.out.println("Ingrese el numero de la posicion "+inc);
       numX=leer.nextDouble();
       sumT=sumT+numX;
       }
       System.out.println("La suma de los numeros es: "+sumT);
   }
   public static void tablaMultiplicar1a9(){
       for (int inicio = 1; inicio <=10; inicio++) {
           for (int numi = 1; numi <=10; numi++) {
              System.out.println(inicio+"*"+numi+"="+(inicio*numi)); 
           }
           System.out.println("\n");
       }
   }
    
    public static void cobroPorLlamada(){
        // Definir Variables segun tipo de datos
        int ti=0;//Inicializando Valores
        String di,tu;
        double st,imp, tp;
        //Leer Valores desde el Teclado
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Minutos:");
        ti=leer.nextInt();        
        System.out.println("Ingrese el día de la llamada:");
        di=leer.next();        
        System.out.println("Ingrese el Turno de llamada:");
        tu=leer.next();
        
        if(ti<=5){
            st=ti*1;
        }else if(ti<=8){
            st=(ti-5)*0.80+5;
        }else if(ti<=10){
            st=(ti-8)*0.70+7.4;
        }else{
            st=(ti-10)*0.50+8.8;
        }
        
        if(di.equals("Domingo")){//equals es para comparar cadena
            imp=st*0.03;
        }else{
            if(tu.equals("Matutino")){
                imp=st*0.15;    
            }else{
                imp=st*0.10;
            }
        }
        tp=st+imp;
        //Imprimir datos de Salida
        System.out.println("El subtotal de la llamada es:"+st);
        System.out.println("El Impuesto a pagar es:"+imp);
        System.out.println("Total a pagar es:"+tp);
        System.out.println("La llamada se realizó en el día: "+di);
        System.out.println("La llamada fue en Turno: "+tu);
                 
   }
    
    public static void main(String[] args) {
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: cobroPorLlamada(); break;
            case 2: suma10Cantidades();break;
            case 3: sumaCantidadForma2(); break;
            case 4: sumaCantidadForma3(); break;
            
            default: System.out.println("Opción Inválida!!");break;
            }  
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
        }
    }
    
}
