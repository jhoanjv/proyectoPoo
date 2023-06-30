
/**
 * Write a description of class Ventas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ventas
{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int numVendedores = 0, opcMenu = 0;
        Vendedor[] losVendedores = new Vendedor[50];
        String id,nombre;
        double ventaUno,ventaDos,ventaTres;
        double promedio = 0;
        
        while(opcMenu !=3){
            System.out.println("\nMenu de opciones");
            System.out.println("1. Adicionar un vendedor");
            System.out.println("2. Calcular Promedio");
            System.out.println("3. Salir");
            System.out.println("Escoja una opcion:");
            opcMenu = sc.nextInt();
            
            if(opcMenu == 1){
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
                
                Vendedor unVendedor = new Vendedor(id,nombre,ventaUno,ventaDos,ventaTres);
                losVendedores[numVendedores] = unVendedor;
                numVendedores++;                
            }
            else if (opcMenu == 2){
                promedio = 0;
                for(int i = 0; i < numVendedores; i++){
                    promedio = promedio + losVendedores[i].calcularPromedio()/numVendedores;
                }
                System.out.println("\nEl promedio de ventas es : "+promedio);
            }
            
            
        }
    }
}
