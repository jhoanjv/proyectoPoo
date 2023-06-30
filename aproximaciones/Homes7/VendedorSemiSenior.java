/**
 * Write a description of class VendedorSemiSenior here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendedorSemiSenior extends Vendedor
{
    private double ventaUno;
    private double ventaDos;
    private double ventaTres;
    
    VendedorSemiSenior(String id, String nombre, double ventaUno, double ventaDos, double ventaTres)throws Exception{
        super(id,nombre);
        setVentaUno(ventaUno);
        setVentaDos(ventaDos);
        setVentaTres(ventaTres);
    }
    
    public double calcularPromedio(){
        return ( ventaUno + ventaDos + ventaTres ) / 3;
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
    
    public double getVentaTres(){
        return ventaTres;
    }
    public void setVentaTres(double ventaTres){
        if(ventaTres >= 0) this.ventaTres = ventaTres;
        else this.ventaTres = 0;
    }
    
}
