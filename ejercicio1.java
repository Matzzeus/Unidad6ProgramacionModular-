import java.util.Scanner;

public class ejercicio1{
    
    public static void main (String[] args){
            int ar[]  = new int[5];
            System.out.println("ingrese 5 digitos");  
            Scanner scanner = new Scanner(System.in);
            for ( int i= 0; i < 5; i++){
                ar[i]= scanner.nextInt();
          
        }       
           orden(ar);
            }
            public static void  orden (  int arreglo[] )  {
           
                for ( int i = 0; i < 5 ; i++){
                System.out.println ("El Indice ["+ (i) +"]="+ " esta en el valor "+ arreglo[i]);
           }
    }
}



  
