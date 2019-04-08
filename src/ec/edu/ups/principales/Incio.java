/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.principales;

import ec.edu.ups.clases.Carrera;
import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Grupo;
import ec.edu.ups.clases.HistorialCalificaciones;
import ec.edu.ups.clases.Materia;
import ec.edu.ups.clases.Profesor;
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
     //Agregar carrera a sede ss
     sedeCuenca.addCarrera(carrera);
     sedeCuenca.addCarrera(car);
     sedeCuenca.addCarrera(ca);
     //Materias
     Materia ma1 = new Materia(1,"Algebra Lineal",3,128,1);
     Materia ma2 = new Materia(2,"Programacion Aplicada",4,200,3);
     Materia ma3 = new Materia(3,"Logica",2,80,1);
     Materia ma4 = new Materia(4,"Fundamentos Sistemas Operativos",5,10,2);
     Materia ma5 = new Materia(5,"Fundamentos de Programacion",3,188,2);
     Materia ma6 = new Materia(6,"Ecuaciones Diferenciales",3,120,2);
     //Agregar  materia a la carrera
     carrera.addMateria(ma1);
     car.addMateria(ma2);
     ca.addMateria(ma2);
     carrera.addMateria(ma3);
     car.addMateria(ma4);
     ca.addMateria(ma5);
     ca.addMateria(ma6);
     //Estudiantes
     Estudiante es= new Estudiante(1,"Pepito","010249595","0998972922","Gualaceo","pepito.2@gmail.com");
     Estudiante es2= new Estudiante(2,"Erick","010246654","0996568236","Cuenca","ericsebas.2i@gmail.com");
     Estudiante es3=new Estudiante(3,"Carlos","011555555","0984165488","Jadan","calor21.i@gmail.com");
     Estudiante es4= new Estudiante(2,"Ronal","084161644","0231555445","Azoguez","ronale1.2i@gmail.com");
        ///Grupo 
     Grupo g = new Grupo(1,"Inicial",30);
     Grupo g2 = new Grupo(2,"UPS",40);
     Grupo g3 = new Grupo(3,"SALESIANA",60);   
     //Agregar grupo a materias
     ma1.addGrupo(g);
     ma2.addGrupo(g2);
      // Profesores 
      Profesor p1= new Profesor("Ingeniero en Sistemas",320,"Profesor de Electronica",1,"Paola Ingavelez","0102262649","09986151","Cuenca","poal1@gmail.com");
      Profesor p2= new Profesor("Ingeniero Industrial ",320,"Profesor",2,"Adrian Ñauta","016491545","09987116","Guayaquil","adrianÑ@gmail.com");
      //Historial Estudiantes
      HistorialCalificaciones h = new HistorialCalificaciones(35,13,35,5);
      HistorialCalificaciones h2 = new HistorialCalificaciones(25,10,30,10);
      HistorialCalificaciones h3 = new HistorialCalificaciones(10,5,38,15);
      HistorialCalificaciones h4 = new HistorialCalificaciones(40,15,10,10);
      //Agregar historial a estudiantes
      es.addHistorialCalificaciones(h);
      es2.addHistorialCalificaciones(h2);
      es3.addHistorialCalificaciones(h3);
      es4.addHistorialCalificaciones(h4);
      
        //System.out.println(sedeCuenca);
        System.out.println(ma1);
        System.out.println(es);
        System.out.println(es2);
        System.out.println(es3);
        System.out.println(es4);
      ///
    }
    
}
