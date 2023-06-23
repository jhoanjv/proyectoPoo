import java.util.Scanner;
public class Ventas{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        Inmobiliaria miInmobiliaria = new Inmobiliaria("123456","Houses.sas","Ciudad Bolivar");
        String id, nombre;
        double promedio = 0;
        
        System.out.println("Digite el numero de vendedores junior: ");
        int numVendedores1 = sc.nextInt();
        
        for(int i = 0; i < numVendedores1; i++){
            double ventaUno,ventaDos;
            
            System.out.println("Digite la identificacion del vendedor: ");
            id = sc.next();
            System.out.println("Digite el nombre del vendedor: ");
            nombre = sc.next();
            System.out.println("Digite la venta uno: ");
            ventaUno = sc.nextDouble();
            System.out.println("Digite la venta dos: ");
            ventaDos = sc.nextDouble();
            
            miInmobiliaria.adicionarVendedorJunior(id, nombre,ventaUno, ventaDos);
        }
        
        System.out.println("Digite el numero de vendedores semi-senior: ");
        int numVendedores2 = sc.nextInt();
        
        for(int i = 0; i < numVendedores2; i++){
            double ventaUno,ventaDos, ventaTres;
            
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
            
            miInmobiliaria.adicionarVendedorSemiSenior(id, nombre, ventaUno, ventaDos, ventaTres);
        }
        
        System.out.println("Digite el numero de vendedores senior: ");
        int numVendedores3 = sc.nextInt();
        
        for(int i = 0; i < numVendedores3; i++){
            double ventaUno,ventaDos, ventaTres, ventaCuatro;
            
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
            System.out.println("Digite la venta cuatro: ");
            ventaCuatro = sc.nextDouble();
            
            miInmobiliaria.adicionarVendedorSenior(id, nombre, ventaUno, ventaDos, ventaTres, ventaCuatro);
        }
        
        promedio = miInmobiliaria.calcularPromedioGeneral();
        System.out.println("\nEl promedio de ventas es: " + promedio); 
    }
}