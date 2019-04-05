/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.principales;

import ec.edu.ups.clases.Carrera;
import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Materia;
import ec.edu.ups.clases.Sede;

/**
 *
 * @author erics
 */
public class Incio {
    
    public static void main (String []args )
    {
     //Estudiante obj = new Estudiante();
       //Sede
     Sede sedeCuenca = new Sede(1,"Sede Cuenca","Calle vieja","65464646");
     //Carreras
     Carrera carrera = new Carrera(1, "Mecatronica",1,12,"Ingeniero");
     Carrera car = new Carrera (2,"Computacion",2,14,"Sistematico");
     Carrera ca = new Carrera (3,"Psicologia",13,15,"Loquero");
     //Materias
     Materia ma1 = new Materia(1,"Algebra Lineal",3,128,1);
     Materia ma2 = new Materia(2,"Programacion Aplicada",4,200,3);
     Materia ma3 = new Materia(3,"Logica",2,80,1);
     Materia ma4 = new Materia(4,"Fundamentos Sistemas Operativos",5,10,2);
     Materia ma5 = new Materia(5,"Fundamentos de Programacion",3,188,2);
     //Estudiantes
     Estudiante es= new Estudiante(1,"Pepito","010249595","0998972922","Gualaceo","pepito.2@gmail.com");
     Estudiante es2= new Estudiante(2,"Erick","010246654","0996568236","Cuenca","ericsebas.2i@gmail.com");
     Estudiante es3=new Estudiante(3,"Carlos","011555555","0984165488","Jadan","calor21.i@gmail.com");
     Estudiante es4= new Estudiante(2,"Ronal","084161644","0231555445","Azoguez","ronale1.2i@gmail.com");
        
        
    }
    
}
