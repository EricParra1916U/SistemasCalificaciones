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
public class Estudiante extends Persona{
    
     private Carrera carrera;
    public void setCarrera (Carrera carrera)
    {
        this.carrera = carrera;
    }
    
    public Carrera getCarrera()
    {
        return this.carrera;
    }
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + '}';
    }

    public Estudiante(int codigo) {
        super(codigo);
    }

    public Estudiante(int codigo, String nombre, String cedula) {
        super(codigo, nombre, cedula);
    }

    public Estudiante(int codigo, String nombre, String cedula, String telefono, String direccion, String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);
        this.setCarrera(carrera);
    }

    public void addHistorialCalificaciones(HistorialCalificaciones h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
