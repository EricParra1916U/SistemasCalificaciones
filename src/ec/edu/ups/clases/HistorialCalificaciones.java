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
public class HistorialCalificaciones {
    
    private Materia materia;
    private Estudiante estudiante;
    private int aprovechamiento ;
    private int examen;
    private int aprovechamineto2;
    private int examen2;
   
    
    
    public void setMateria(Materia materia)
    {
        this.materia = materia;
       
    }
    public void setEstudiante(Estudiante estudiante)
    {
        this.estudiante = estudiante;
    }
     public void setAprovechamiento(int aprovechamiento)
    {
        this.aprovechamiento = aprovechamiento;
    }
     public void setExamen(int examen)
    {
        this.examen = examen;
    }
     public void setAprovechamiento2(int aprovechamiento2)
    {
        this.aprovechamineto2= aprovechamiento2;
    }
     public void setExamen2(int examen2)
    {
        this.examen2 = examen2;
    }
    
     public Materia getMateria ()
     {
         return this.materia;
     }
      public Estudiante getEstudiante ()
     {
         return this.estudiante;
     }
      public int getAprovechamiento ()
     {
         return this.aprovechamiento;
     }
       public int getExamen ()
     {
         return this.examen;
     }
        public int getAprovechamiento2 ()
     {
         return this.aprovechamineto2;
     }
         public int getExamen2 ()
     {
         return this.examen2;
     }

    public HistorialCalificaciones( int aprovechamiento, int examen, int aprovechamineto2, int examen2) {
        this.aprovechamiento = aprovechamiento;
        this.examen = examen;
        this.aprovechamineto2 = aprovechamineto2;
        this.examen2 = examen2;
        //this.materia = materia;,Materia materia
    }

}
