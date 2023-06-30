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
    
    public int getNumVendedores1(){
        return numVendedores;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numVendedores; i++){
            promedio = promedio + vendedor[i].calcularPromedio();
        }
        
        return promedio/3;
    }
    
    public void adicionarVendedorJunior(String id, String nombre, double ventaUno, double ventaDos){
        vendedor[numVendedores] = new VendedorJunior(id, nombre,ventaUno, ventaDos);
        numVendedores++;
    }
    public void adicionarVendedorSemiSenior(String id, String nombre, double ventaUno, double ventaDos, double ventaTres){
        vendedor[numVendedores] = new VendedorSemiSenior(id, nombre,ventaUno, ventaDos, ventaTres);
        numVendedores++;
    }
    public void adicionarVendedorSenior(String id, String nombre, double ventaUno, double ventaDos, double ventaTres, double ventaCuatro){
        vendedor[numVendedores] = new VendedorSenior(id, nombre,ventaUno, ventaDos, ventaTres, ventaCuatro);
        numVendedores++;
    }
}