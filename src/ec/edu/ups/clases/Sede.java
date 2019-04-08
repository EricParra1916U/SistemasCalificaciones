/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.List;

/**
 *
 * @author erics
 */
public class Sede {
    
    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono ;
    private List<Carrera> carreras;
    
    public void setCodigo(int codigo)
    {  
      this.codigo=codigo;  
    }
    public void setNombre(String nombre)
    {    
      this.nombre=nombre;      
    }
    public void setDireccion(String direccion)
    {    
      this.direccion=direccion;      
    }
    public void setTelefono(String telefono)
    {    
      this.telefono=telefono;      
    }
    public void setCarrera (List Carrera)
    {
        this.carreras = carreras;
    }
    
    public int getCodigo()
    {
        return this.codigo;
    }
    public String getNombre()
    {
        return this.nombre;
    }
     public String getDireccion()
    {
        return this.direccion;
    }
      public String getTelefono()
    {
        return this.telefono;
    }
     public List getCarrera()
    {
        return this.carreras;
    }

    public Sede(int codigo, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void addCarrera(Carrera carrera) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Sede{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

   
    
    
}
