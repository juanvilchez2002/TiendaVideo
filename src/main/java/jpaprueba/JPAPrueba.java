
package jpaprueba;

import java.util.ArrayList;
import java.util.Date;
import jpaprueba.logica.Alumno;
import jpaprueba.logica.Carrera;
import jpaprueba.logica.Controladora;
import jpaprueba.persistencia.ControladoraPersistencia;


public class JPAPrueba {


    public static void main(String[] args) {
        
        //ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        Controladora control = new Controladora();
        
        //creación de carrera
        Carrera carrera = new Carrera(25, "Tecnica en Programación");
        
        //guardando de carrera en la BD
        control.crearCarrera(carrera);
        
        //creación de alumno con carrera
        Alumno al = new Alumno(23, "Ana", "Cañote", new Date(), carrera);
        
        //guardamos el alumno en la BD
        control.crearAlumno(al);
        
        //vemos el resultado
        System.out.println("-------------------");
        System.out.println("---DATOS ALUMNO----");
        Alumno alu = control.traerAlumno(23);
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getNombre());
        System.out.println("Carrera: "+alu.getCarrera().getNombre());
    }
    
}
