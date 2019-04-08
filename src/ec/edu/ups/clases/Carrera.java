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
public class Carrera {
    private int codigo;
    private String nombre;
    private List<Materia> materia;
    private int numeroSemestre;
    private int numeroEstudiante;
    private String titulo;
    
    
    public void setCodigo(int codigo)
    {  
      this.codigo=codigo;  
    }
    public void setNombre(String nombre)
    {    
      this.nombre=nombre;      
    }
    public void setNumeroSemestre(int numeroSemestre)
    {    
      this.numeroSemestre=numeroSemestre;
    }
    public void setNumeroEstudiante(int numeroEstudiante)
    {
      this.numeroEstudiante=numeroEstudiante;    
    }
    public void setTitulo(String titulo)
    {  
      this.titulo=titulo;  
    }
    
    public int getCodigo()
    {
        return this.codigo;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public int getNumeroSemestre()
    {
        return this.numeroSemestre;
    }
    public int getNumeroEstudiantes()
    {
        return this.numeroEstudiante;
    }
    public String getTitulo()
    {
        return this.titulo;
    }

    public Carrera(int codigo, String nombre, int numeroSemestre, int numeroEstudiante, String titulo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroSemestre = numeroSemestre;
        this.numeroEstudiante = numeroEstudiante;
        this.titulo = titulo;
    }

    public void addMateria(Materia ma1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre + ", numeroSemestre=" + numeroSemestre + ", numeroEstudiante=" + numeroEstudiante + ", titulo=" + titulo + '}';
    }
    
}
