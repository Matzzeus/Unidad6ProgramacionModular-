import java.util.Scanner;

public class ejercicio3{
    
public static void main (String[] args){
 
    int ar[]  = new int[8];
    System.out.println("ingrese 8 digitos");  
    Scanner scanner = new Scanner(System.in);
    for ( int i= 0; i < 8; i++){
        ar[i]= scanner.nextInt();
  
}       
   orden(ar);
   buscar (ar); 
    }
    public static void  orden (  int arreglo[] )  {
   
        for ( int i = 0; i < 8 ; i++){
        System.out.println ("El Indice ["+ (i) +"]="+ " esta en el valor "+ arreglo[i]);
    }
    
    }
    public static void buscar ( int  arreglos[] ) {
        int bus = arreglos [0] ;
        int n1;
        boolean siu = false ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el numero que quiere buscar");
        n1 = scanner.nextInt();

        for ( int i = 0; i < 8 ; i++){
            if (n1 == arreglos[i] ) {
                siu = true;
            }
            
        }
        if (siu == true){
        System.out.print( "se encontro el numero buscado");
    }
    else {
        System.out.print( "no esta el numero");
    }
    }
}
 
 