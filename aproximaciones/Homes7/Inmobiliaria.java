
/**
 * Write a description of class Inmobiliaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Inmobiliaria
{
    private final String nit;
    private String nombreInmobiliaria;
    private String direccion;
    private ArrayList vendedor;
    
    public Inmobiliaria(String nit,String nombreInmobiliaria,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setnombreInmobiliaria(nombreInmobiliaria);
        setDireccion(direccion);        
        vendedor = vendedor = new ArrayList();  //rebundante
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getnombreInmobiliaria(){
        return nombreInmobiliaria;
    }
    public void setnombreInmobiliaria(String nombreInmobiliaria){
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
        
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < vendedor.size(); i++){
            promedio += ((Vendedor)vendedor.get(i)).calcularPromedio();
        }

        return promedio / 3;
    }
    
    public void adicionarVendedor(String id, String nombre, double ventaUno, double ventaDos)throws Exception{
        vendedor.add(new VendedorJunior(id, nombre, ventaUno, ventaDos));
    }
    
    public void adicionarVendedor(String id, String nombre, double ventaUno, double ventaDos, double ventaTres)throws Exception{
        vendedor.add(new VendedorSemiSenior(id, nombre, ventaUno, ventaDos, ventaTres));
    }
    
    public void adicionarVendedor(String id, String nombre, double ventaUno, double ventaDos, double ventaTres, double ventaCuatro)throws Exception{
        vendedor.add(new VendedorSenior(id, nombre, ventaUno, ventaDos, ventaTres, ventaCuatro));
    }
}
