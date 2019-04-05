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
public class Profesor {
    
    private String tiutlo;
    private Double salario;
    private String cargo;
    
    
    public void setTitulo(String titulo)
    {
        this.tiutlo=titulo;
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
        return this.tiutlo;
    }
    public Double getSalario()
    {
        return this.salario;
    }
    public String getCargo()
    {
        return this.cargo;
    }
}
