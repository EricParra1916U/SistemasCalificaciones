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
public class Materia {
    
    private int codigo;
    private String nombre;
    private int numeroCreditos;
    private int numeroHoras;
    private int nivel;
    private Grupo  grupo;
    private Profesor profesor;
    
    public void setCodigo(int codigo)
    {
        this.codigo=codigo;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setNumeroCreditos(int numeroCreditos)
    {
        this.numeroCreditos=numeroCreditos;
    }
    public void setNumeroHoras(int numeroHoras)
    {
        this.numeroHoras=numeroHoras;
    }
     public void Nivel(int nivel)
    {
        this.nivel=nivel;
    }
     
     public void setGrupo (Grupo grupo)
     {
         this.grupo = grupo ;
         
     }
     public void setProfesor(Profesor profesor)
     {
         this.profesor = profesor ;
         
     }
     
     public int getCodigo()
     {
         return this.codigo;
     }
     public String getNombre()
     {
         return this.nombre;
     }
     public int getNumeroCreditos()
     {
         return this.numeroCreditos;
     }
     public int getNumeroHoras()
     {
         return this.numeroHoras;
     }
     public int getNivel()
     {
         return this.nivel;
     }
      public Grupo getGrupo()
     {
         return this.grupo;
     }
     public Profesor getProfesor()
     {
         return this.profesor;
     }

    public Materia(int codigo, String nombre, int numeroCreditos, int numeroHoras, int nivel) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
        this.numeroHoras = numeroHoras;
        this.nivel = nivel;
    }

    public void addGrupo(Grupo g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     
     
     
}



