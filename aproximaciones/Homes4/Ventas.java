import java.util.Scanner;
public class Ventas{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numVendedores;
        Inmobiliaria miInmobiliaria = new Inmobiliaria("123456","Houses.sas","Ciudad Bolivar");
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
            miInmobiliaria.adicionarVendedor(id, nombre,ventaUno, ventaDos, ventaTres);
        }
        
        promedio = miInmobiliaria.calcularPromedioGeneral();
        System.out.println("\nEl promedio de ventas es: " + promedio); 
    }
}