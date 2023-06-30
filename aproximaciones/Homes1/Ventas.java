
/**
 * Write a description of class Ventas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ventas
{
    public static void main(String arg[]){
    
        Scanner sc = new Scanner(System.in);
        int numVendedores;
        Vendedor[] losVendedores = new Vendedor[50];
        String nombre;
        String id;
        double ventaUno,ventaDos,ventaTres;
        double promedio=0;
        
        System.out.println("Digite el numero de vendedores");
        numVendedores = sc.nextInt();
    
        for(int i=0 ; i < numVendedores; i++){
            
            System.out.println("Digite la identificacion del vendedor: ");
            id = sc.next();
            System.out.println("Digite el nombre del vendedor: ");
            nombre = sc.next();
            System.out.println("Digite la venta uno: ");
            ventaUno = sc.nextDouble();
            System.out.println("Digite la venta dos: ");
            ventaDos = sc.nextDouble();
            System.out.println("Digite la venta tres: ");
            ventaTres = sc.nextDouble();
            
            
            
            Vendedor unVendedor = new Vendedor();
            unVendedor.id = id;
            unVendedor.nombre = nombre;
            unVendedor.ventaUno = ventaUno;
            unVendedor.ventaDos = ventaDos;
            unVendedor.ventaTres = ventaTres;
            
            losVendedores[i] = unVendedor;
            
        }
        
        for(int i = 0; i < numVendedores; i++){
                double sum =(losVendedores[i].ventaUno +losVendedores[i].ventaDos +losVendedores[i].ventaTres)/3;
                promedio = promedio + sum / numVendedores;
            }
        System.out.println("El promedio de ventas es: "+ promedio);

        
            
        
        
    }
    
}
