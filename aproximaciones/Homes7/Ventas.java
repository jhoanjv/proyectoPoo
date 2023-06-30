import java.util.Scanner;
public class Ventas{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        Inmobiliaria miInmobiliaria = new Inmobiliaria("123456","Houses.sas","Ciudad Bolivar");
        String id, nombre;
        double promedio = 0;
        double ventaUno, ventaDos, ventaTres, ventaCuatro;
        int opcMenu = 0;
        
        do{
            System.out.println("\nMenu de Opciones");
            System.out.println("[1]- Adicionar Vendedor Junior: ");
            System.out.println("[2]- Adicionar Vendedor Semi-Senior: ");
            System.out.println("[3]- Adicionar Vendedor Senior: ");
            System.out.println("[4]- Calcular Promedio ");
            System.out.println("[5]- Salir \n");
            System.out.println("Escoja una Opcion: ");
            opcMenu = sc.nextInt();
            
            switch(opcMenu){
                case 1:
                    System.out.println("Digite la identificacion del vendedor: ");
                    id = sc.next();
                    System.out.println("Digite el nombre del vendedor: ");
                    nombre = sc.next();
                    System.out.println("Digite la venta uno: ");
                    ventaUno = sc.nextDouble();
                    System.out.println("Digite la venta dos: ");
                    ventaDos = sc.nextDouble();
                    
                    try{
                        miInmobiliaria.adicionarVendedor(id, nombre,ventaUno, ventaDos);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("********************");
                    break;
                
                case 2:
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
                    try{
                        miInmobiliaria.adicionarVendedor(id, nombre,ventaUno, ventaDos, ventaTres);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("********************");
                    break;   
                
                case 3:
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
                    try{
                        miInmobiliaria.adicionarVendedor(id, nombre,ventaUno, ventaDos, ventaTres, ventaCuatro);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("********************");
                    break;
                
                case 4:
                    sc.nextLine();
                    promedio = miInmobiliaria.calcularPromedioGeneral();
                    System.out.println("\n El promedio de ventas es: " + promedio); 
                    break;
                
                default:
                    System.out.println("Ha Seleccionado Salir");
            }
        }while(opcMenu!=5);
        
    }
}