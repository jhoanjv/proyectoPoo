import java.util.Scanner;
public class Ventas{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numVendedores;
        Vendedor[] losVendedores = new Vendedor[50];
        String id, nombre;
        double ventaUno, ventaDos, ventaTres;
        double promedio = 0;
        
        System.out.println("Digite el numero de vendedores: ");
        numVendedores = sc.nextInt();
        
        for(int i = 0; i < numVendedores; i++){
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
            Vendedor unVendedor = new Vendedor(id, nombre,ventaUno, ventaDos, ventaTres);
            losVendedores[i] = unVendedor;
        }
        
        for(int i = 0; i < numVendedores; i++){
            promedio = promedio + losVendedores[i].calcularPromedio() / numVendedores; 
        }
          
        System.out.println("\nEl promedio de ventas es: " + promedio); 
    }
}