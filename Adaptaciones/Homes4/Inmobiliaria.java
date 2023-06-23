public class Inmobiliaria
{
    private final String nit;
    private String nombreInmobiliaria;
    private String direccion;
    private Vendedor[] vendedor;
    private int numVendedores;
    
    public Inmobiliaria(String nit,String nombreInmobiliaria,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreInmobiliaria(nombreInmobiliaria);
        setDireccion(direccion);        
        vendedor = new Vendedor[50];
        numVendedores = 0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreInmobiliaria(){
        return nombreInmobiliaria;
    }
    public void setNombreInmobiliaria(String nombreInmobiliaria){
        if(nombreInmobiliaria != null){
            this.nombreInmobiliaria = nombreInmobiliaria;
        }else{
            this.nombreInmobiliaria = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
    
    public int getNumVendedores(){
        return numVendedores;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numVendedores; i++){
            promedio = promedio + vendedor[i].calcularPromedio() / numVendedores;
        }
        return promedio;
    }
    
    public void adicionarVendedor(String id, String nombre, double ventaUno, double ventaDos, double ventaTres){
        Vendedor v = new Vendedor(id, nombre,ventaUno, ventaDos, ventaTres);
        vendedor[numVendedores] = v;
        numVendedores++;
    }
}