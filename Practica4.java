package practica4;

import java.util.Scanner;

public class Practica4 {

    
    public static void main(String[] args) 
    {
        Scanner dinero = new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad de dinero que desea convertir: ");
        double pesos = dinero.nextDouble();
       
        double dolares = pesos / 17.13;
        
        System.out.println("la cantidad de pesos en dolares es: " + dolares);
        
        double euros = pesos / 18.27;
        
        System.out.println("La cantidad de pesos en euros es: " + euros);
        
        dinero.close();
                
    }
    
}
