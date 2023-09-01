
package jpaprueba.persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jpaprueba.exceptions.NonexistentEntityException;
import jpaprueba.logica.Alumno;
import jpaprueba.logica.Carrera;

public class ControladoraPersistencia {
    
    //instancias de controladoras
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carJpa = new CarreraJpaController();
    
    //metodos de la controladora de alumno
    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

    public void eliminarAlumno(Integer id) {
        try {
            aluJpa.destroy(id);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(Integer id) {        
        return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerAlumnos() {
        List<Alumno> listaAlumno = aluJpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList(listaAlumno);
        return listaAlumnos;
    }
    
    //metodos de la controladora de carrera
    public void crearCarrera(Carrera car) {
        carJpa.create(car);
    }

    public void eliminarCarrera(Integer id) {
        try {
            carJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera car) {
        try {
            carJpa.edit(car);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(Integer id) {        
        return carJpa.findCarrera(id);
    }

    public ArrayList<Carrera> traerCarreras() {
        List<Carrera> carrera = carJpa.findCarreraEntities();
        ArrayList<Carrera> carreras = new ArrayList(carrera);
        return carreras;
    }
    
}
