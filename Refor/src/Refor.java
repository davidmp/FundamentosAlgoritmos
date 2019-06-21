
import javax.swing.JOptionPane;


public class Refor {
    public void imprimir(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public void imprimir(Object[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    
    public int[][] trans30(int dime,int NumIni){
        int[][] matrix=new int[dime][dime];
        for (int Principal = 0; Principal < dime/2; Principal++) {
            for (int LDx = Principal; LDx < dime-Principal-1; LDx++) {
                matrix[LDx][dime-Principal-1]=NumIni;
                NumIni++;
            }
            for (int LIx = dime-Principal-1; LIx >Principal; LIx--) {
                matrix[dime-Principal-1][LIx]=NumIni;
                NumIni++;
            }
            for (int LIx = dime-Principal-1; LIx >Principal; LIx--) {
                matrix[LIx][Principal]=NumIni;
                NumIni++;
            }
            for (int LSx = Principal; LSx < dime-Principal-1 ; LSx++) {
                matrix[Principal][LSx]=NumIni;
                NumIni++;
            }
            if(dime%2!=0){
             matrix[dime/2][dime/2]=NumIni;
            }
        }
        
        return matrix;
    }
    
    public void matrizOperacion(int[][] data){
        int numPares=0, numImpares=0;        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if(data[i][j]%2==0){
                    numPares=numImpares+data[i][j];
                }else{
                numImpares=numImpares+data[i][j];
                }
                }
            }
        System.out.println("Num Pares :"+(numPares));
        System.out.println("Num Impares :"+(numImpares));
        System.out.println("Suma :"+(numPares+numImpares));
        System.out.println("Division :"+(numPares/numImpares));
        System.out.println("Multiplicaion :"+(numPares*numImpares));
        System.out.println("Resta :"+(numPares-numImpares));
        
        }
    
    
    
    
public Object[][] trans30Cadena(int dime,int NumIni){
        Object[][] matrix=new Object[dime][dime];
        for (int Principal = 0; Principal < dime/2; Principal++) {
            for (int LDx = Principal; LDx < dime-Principal-1; LDx++) {
                matrix[LDx][dime-Principal-1]=NumIni;
                NumIni++;
            }
            for (int LIx = dime-Principal-1; LIx >Principal; LIx--) {
                matrix[dime-Principal-1][LIx]=NumIni;
                NumIni++;
            }
            for (int LIx = dime-Principal-1; LIx >Principal; LIx--) {
                matrix[LIx][Principal]=NumIni;
                NumIni++;
            }
            for (int LSx = Principal; LSx < dime-Principal-1 ; LSx++) {
                matrix[Principal][LSx]=NumIni;
                NumIni++;
            }
            if(dime%2!=0){
             matrix[dime/2][dime/2]="Holas";
            }
      
        }
        
        return matrix;
    }    
    
    
    public int[][] hola(int dime,int NumIni,String n){
        n="hola";
        int [][] matrix=new int[dime][dime];
        for (int Principal = 0; Principal < dime/2; Principal++) {
            for (int LDx = Principal; LDx < dime-Principal-1; LDx++) {
                matrix[LDx][dime-Principal-1]=NumIni;
                NumIni++;
            }
            for (int LIx = dime-Principal-1; LIx >Principal; LIx--) {
                matrix[dime-Principal-1][LIx]=NumIni;
                NumIni++;
            }
            for (int LIx = dime-Principal-1; LIx >Principal; LIx--) {
                matrix[LIx][Principal]=NumIni;
                NumIni++;
            }
            for (int LSx = Principal; LSx < dime-Principal-1 ; LSx++) {
                matrix[Principal][LSx]=NumIni;
                NumIni++;
            }
            if(dime%2!=0){
             matrix[dime/2][dime/2]=NumIni;
                if(dime%2!=0){
                }
            }
           
        }
        
        return matrix;
    }
    public int[][] trans31(int dime,int NumIni){
        int[][] matrix=new int[dime][dime];
        for (int Principal = 0; Principal < dime/2; Principal++) {
            for (int LDx = Principal; LDx < dime-Principal-1; LDx++) {
                matrix[LDx][dime-Principal-1]=NumIni;
                if(NumIni%2==0){
                    matrix[LDx][dime-Principal-1]=NumIni/2;
                }
                NumIni++;
            }
            for (int LIx = dime-Principal-1; LIx >Principal; LIx--) {
                matrix[dime-Principal-1][LIx]=NumIni;
                if(NumIni%2==0){
                    matrix[dime-Principal-1][LIx]=NumIni/2;
                }
                NumIni++;
            }
            for (int LIx = dime-Principal-1; LIx >Principal; LIx--) {
                matrix[LIx][Principal]=NumIni;
                if(NumIni%2==0){
                    matrix[LIx][Principal]=NumIni/2;
                }
                NumIni++;
            }
            for (int LSx = Principal; LSx < dime-Principal-1 ; LSx++) {
                matrix[Principal][LSx]=NumIni;
                if(NumIni%2==0){
                    matrix[Principal][LSx]=NumIni/2;
                }
                NumIni++;
            }
            if(dime%2!=0){
             matrix[dime/2][dime/2]=NumIni/2;
                
            }
        }
            
        
        
        return matrix;
    }
    public int[][] trans32(int dime,int NumIni){
        int[][] matrix=new int[dime][dime];
        for (int Principal = 0; Principal < dime/2; Principal++) {
            for (int LDx = Principal; LDx < dime-Principal-1; LDx++) {
                matrix[LDx][dime-Principal-1]=NumIni/2;
                if(NumIni%2==0){
                    matrix[LDx][dime-Principal-1]=NumIni/2;
                }
                NumIni++;
            }
            for (int LIx = dime-Principal-1; LIx >Principal; LIx--) {
                matrix[dime-Principal-1][LIx]=NumIni/2;
                if(NumIni%2==0){
                    matrix[dime-Principal-1][LIx]=NumIni/2;
                }
                NumIni++;
            }
            for (int LIx = dime-Principal-1; LIx >Principal; LIx--) {
                matrix[LIx][Principal]=NumIni/2;
                if(NumIni%2==0){
                    matrix[LIx][Principal]=NumIni/2;
                }
                NumIni++;
            }
            for (int LSx = Principal; LSx < dime-Principal-1 ; LSx++) {
                matrix[Principal][LSx]=NumIni/2;
                if(NumIni%2==0){
                    matrix[Principal][LSx]=NumIni/2;
                }
                NumIni++;
            }
            if(dime%2!=0){
             matrix[dime/2][dime/2]=NumIni/2;
                
            }
        }
            
        
        
        return matrix;
    }
    
    
    public int[][] trans33(int dime,int NumIni){
        int[][] matrix=new int[dime][dime];
        for (int Principal = 0; Principal < dime/2; Principal++) {
            for (int LDx = Principal; LDx < dime-Principal-1; LDx++) {
                matrix[LDx][dime-Principal-1]=NumIni/2;
                if(NumIni%2==0){
                    matrix[LDx][dime-Principal-1]=NumIni/2;
                }
                NumIni++;
            }
            for (int LIx = dime-Principal-1; LIx >Principal; LIx--) {
                matrix[dime-Principal-1][LIx]=NumIni/2;
                if(NumIni%2==0){
                    matrix[dime-Principal-1][LIx]=NumIni/2;
                }
                NumIni++;
            }
            for (int LIx = dime-Principal-1; LIx >Principal; LIx--) {
                matrix[LIx][Principal]=NumIni/2;
                if(NumIni%2==0){
                    matrix[LIx][Principal]=NumIni/2;
                }
                NumIni++;
            }
            for (int LSx = Principal; LSx < dime-Principal-1 ; LSx++) {
                matrix[Principal][LSx]=NumIni/2;
                if(NumIni%2==0){
                    matrix[Principal][LSx]=NumIni/2;
                }
                NumIni++;
            }
            if(dime%2!=0){
             matrix[dime/2][dime/2]=NumIni/2;
                
            }
        }

        return matrix;
    }
    
    public static void main(String[] args) {
        Refor tu=new Refor();
        int dimen, ini;
//        dimen=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimención de la matriz: "));
//        ini=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de inicio: "));
//        
        tu.imprimir(tu.trans30Cadena(5,0));
        System.out.println("------------------");
        tu.matrizOperacion(tu.trans30(5, 0));
        //tu.imprimir(tu.trans30(dimen, ini));
        //tu.imprimir(tu.trans31(dimen, ini));
        //tu.imprimir(tu.trans32(dimen, ini));
        //tu.imprimir(tu.hola(5, 0));
        
        
        
    }
    
}
