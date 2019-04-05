/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author erics
 */
public class Profesor  extends Persona{
    
    private String titulo;
    private Double salario;
    private String cargo;
    
    
    public void setTitulo(String titulo)
    {
        this.titulo=titulo;
    }
     public void setSalario(Double salario)
    {
        this.salario=salario;
    }
     public void setCargo(String cargo)
    {
        this.cargo=cargo;
    }
    public String getTitulo()
    {
        return this.titulo;
    }
    public Double getSalario()
    {
        return this.salario;
    }
    public String getCargo()
    {
        return this.cargo;
    }
    
     public Profesor(String titulo, double salario, String cargo, int codigo, String nombre, String cedula, String telefono, String direccion, String correo, Sede sede) {
        super(codigo, nombre, cedula, telefono, direccion, correo, sede);
        this.titulo = titulo;
        this.salario = salario;
        this.cargo = cargo;
    }
}
