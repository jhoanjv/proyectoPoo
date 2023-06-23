public class Vendedor
{
    private final String id;
    private String nombre;
    private double ventaUno;
    private double ventaDos;
    private double ventaTres;
    
    public String getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
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
    
    Vendedor(String id, String nombre, double ventaUno, double ventaDos, double ventaTres){
        if(id != null)this.id = id;
        else this.id = "";    
        setNombre(nombre);
        setVentaUno(ventaUno);
        setVentaDos(ventaDos);
        setVentaTres(ventaTres);
    }
    
    double calcularPromedio(){
        return ( ventaUno + ventaDos + ventaTres ) / 3;
    }
}
