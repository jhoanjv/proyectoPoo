
/**
 * Write a description of class VendedorJunior here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendedorJunior extends Vendedor
{
    private double ventaUno;
    private double ventaDos;
    
    VendedorJunior(String id, String nombre, double ventaUno, double ventaDos)throws Exception{
        super(id,nombre);
        setVentaUno(ventaUno);
        setVentaDos(ventaDos);
    }
    
    public double calcularPromedio(){
        return ( ventaUno + ventaDos ) / 2;
    }
    
    public double getVentaUno(){
        return ventaUno;
    }
    
    public void setVentaUno(double ventaUno){
        if(ventaUno >= 0) this.ventaUno = ventaUno;
        else this.ventaUno = 0;
    }
    
    public double getVentaDos(){
        return ventaDos;
    }
    public void setVentaDos(double ventaDos){
        if(ventaDos >= 0) this.ventaDos = ventaDos;
        else this.ventaDos = 0;
    }
}
