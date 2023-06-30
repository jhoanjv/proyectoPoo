
/**
 * Write a description of class VendedorJunior here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vendedor
{
    protected final String id;
    private String nombre;
    
    public double calcularPromedio(){
        return 0;
    }
    
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
    
    Vendedor(String id, String nombre){
        if(id != null)this.id = id;
        else this.id = "";    
        setNombre(nombre);
    }
}
