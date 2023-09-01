
package jpaprueba.logica;

import java.util.ArrayList;
import java.util.Collection;
import jpaprueba.persistencia.ControladoraPersistencia;


public class Controladora {
    
    //instanciando para poder tner acceso a los metodos
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //Alumnos 
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }   
    
    public void eliminarAlumno(Integer id){
        controlPersis.eliminarAlumno(id);
    }

    public void editarAlumno(Alumno alu) {
        controlPersis.editarAlumno( alu);
    }
    
    public Alumno traerAlumno(Integer id){
        return controlPersis.traerAlumno(id);
    }
    
    public ArrayList<Alumno> traerListaAlumnos(){
        return controlPersis.traerAlumnos();
    }
    
    //Carrera 
    public void crearCarrera(Carrera car){
        controlPersis.crearCarrera(car);
    }   
    
    public void eliminarCarrera(Integer id){
        controlPersis.eliminarCarrera(id);
    }

    public void editarCarrera(Carrera car) {
        controlPersis.editarCarrera(car);
    }
    
    public Carrera traerCarrera(Integer id){
        return controlPersis.traerCarrera(id);
    }
    
    public ArrayList<Carrera> traerListaCarreras(){
        return controlPersis.traerCarreras();
    }
}
