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
public class Estudiante {
    
     private Carrera carrera;

    public Estudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setCarrera (Carrera carrera)
    {
        this.carrera = carrera;
    }
    
    public Carrera getCarrera()
    {
        return this.carrera;
    }
    
    public Estudiante(int codigo)
    {
       
    }
    
}
