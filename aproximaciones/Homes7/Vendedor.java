
/**
 * Write a description of class VendedorJunior here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Vendedor
{
    protected final String id;
    private String nombre;
    
    public Vendedor(String id, String nombre)throws Exception{
        if(id.trim().equals(""))
            throw new Exception("valor invalido en la identificacion");
        
        if(id.matches(".*[a-zA-Z].*"))
            throw new Exception("La identificacion no puede tener caracteres");
        
        this.id = id;
        setNombre(nombre);
        
    }
    
    public abstract double calcularPromedio();
    
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

    
}
