
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
    
    public static void main(String[] args) {
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
    
}
