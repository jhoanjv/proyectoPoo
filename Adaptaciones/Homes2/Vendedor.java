
/**
 * Write a description of class Vendedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vendedor
{
    String nombre;
    String id;
    double ventaUno;
    double ventaDos;
    double ventaTres;
    
    Vendedor(String id,String nombre,double ventaUno, double ventaDos,double ventaTres){
        this.id = id;
        this.nombre = nombre;
        this.ventaUno = ventaUno;
        this.ventaDos = ventaDos;
        this.ventaTres = ventaTres;
    }
    
    double calcularPromedio(){
        return ( ventaUno + ventaDos + ventaTres ) / 3;
    }
}
