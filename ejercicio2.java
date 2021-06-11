import java.util.Scanner;

public class ejercicio2{
    
   
    public static void main (String[] args){
       
        int ar[]  = new int[10];
        for (  int i = 0; i < 10 ; i ++  ){
            
            
            ar[i]= (int) (Math.random() * 99 + 0);
            System.out.println("arreglo [" + i + "] ==== " + ar[i]);
            
        }
        numeromayor(ar);
        }
        public static  void  numeromayor ( int arreglo[]  ) {
            
            int max = arreglo[0]; 
            int contador = 1;
            for (int i = 1; i  < 10; i ++){
                if (max == arreglo[i]){
                    contador++;
            
                }
                else if (max < arreglo[i]) {
                    max = arreglo[i];
                    contador = 1;
                
                }
            }
            System.out.println("el numero maximo es: " + max + " y se repite " + contador +" veces");


        }
    
} 