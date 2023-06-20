
/**
 * Write a description of class Homes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Homes
{
    public static void main(String [] arg){
        Scanner objsc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de vendedores: ");
        int numEmpleados = objsc.nextInt();
        
        
        String[] ids = new String[numEmpleados];
        String[] names = new String[numEmpleados];
        int[] numSolds = new int[numEmpleados];
        
        double sold,comision,sumSolds=0, sumNumSolds = 0;
        
        for (int i=0 ; i<numEmpleados;i++){
         
            System.out.println("\nDigite el id del vendedor "+(i+1)+" : ");
            ids[i]=objsc.next();
            System.out.println("Digite el nombre del vendedor:");
            names[i]=objsc.next();
            System.out.println("Digite el numero de ventas del vendedor:");
            numSolds[i]=objsc.nextInt();
            sumNumSolds += numSolds[i];                       
        }
        
        for (int j=0; j<sumNumSolds;j++){
            System.out.println("Digite el precio del inmueble "+(j+1)+" : ");
            sold = objsc.nextInt();
            sumSolds += sold;
        }
        
        comision = sumSolds*0.03;
        
        System.out.println("La comision para el equipo es de:"+comision);
        
    }
}
