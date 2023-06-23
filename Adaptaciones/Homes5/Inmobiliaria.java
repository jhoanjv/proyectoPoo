public class Inmobiliaria
{
    private final String nit;
    private String nombreInmobiliaria;
    private String direccion;
    private VendedorJunior[] vendedor1;
    private VendedorSemiSenior[] vendedor2;
    private VendedorSenior[] vendedor3;
    private int numVendedores1;
    private int numVendedores2;
    private int numVendedores3;
    
    public Inmobiliaria(String nit,String nombreInmobiliaria,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreInmobiliaria(nombreInmobiliaria);
        setDireccion(direccion);        
        vendedor1 = new VendedorJunior[50];
        vendedor2 = new VendedorSemiSenior[50];
        vendedor3 = new VendedorSenior[50];
        numVendedores1 = 0;
        numVendedores2 = 0;
        numVendedores3 = 0;
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
        return numVendedores1;
    }
    
    public int getNumVendedores2(){
        return numVendedores2;
    }
    
    public int getNumVendedores3(){
        return numVendedores3;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numVendedores1; i++){
            promedio = promedio + vendedor1[i].calcularPromedio() / numVendedores1;
        }
        for(int i = 0; i < numVendedores2; i++){
            promedio = promedio + vendedor2[i].calcularPromedio() / numVendedores2;
        }
        for(int i = 0; i < numVendedores3; i++){
            promedio = promedio + vendedor3[i].calcularPromedio() / numVendedores3;
        }
        
        return promedio/3;
    }
    
    public void adicionarVendedorJunior(String id, String nombre, double ventaUno, double ventaDos){
        vendedor1[numVendedores1] = new VendedorJunior(id, nombre,ventaUno, ventaDos);
        numVendedores1++;
    }
    public void adicionarVendedorSemiSenior(String id, String nombre, double ventaUno, double ventaDos, double ventaTres){
        vendedor2[numVendedores2] = new VendedorSemiSenior(id, nombre,ventaUno, ventaDos, ventaTres);
        numVendedores2++;
    }
    public void adicionarVendedorSenior(String id, String nombre, double ventaUno, double ventaDos, double ventaTres, double ventaCuatro){
        vendedor3[numVendedores3] = new VendedorSenior(id, nombre,ventaUno, ventaDos, ventaTres, ventaCuatro);
        numVendedores3++;
    }
}