/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu03;
import java.util.*;
/**
 *
 * @author tubba
 */
public class RegistroAcademico {
    private Alumno alumno;
    private Map<Asignatura, Double> asignaturasCursadas;
    
    private int totalCreditos;

    public RegistroAcademico() {
    }

    
    public RegistroAcademico(Alumno alumno) {
        this.alumno = alumno;
        this.asignaturasCursadas = new HashMap<>();
        
        this.totalCreditos = 0;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Map<Asignatura, Double> getAsignaturasCursadas() {
        return asignaturasCursadas;
    }

    

    public int getTotalCreditos() {
        return totalCreditos;
    }
    
    
    
    public void agregarAsignatura(Asignatura asignatura, double calificacion){
        asignaturasCursadas.put(asignatura, calificacion);
        totalCreditos += asignatura.getCreditos();
    }
    
    public double calcularPromedio(){
        if(asignaturasCursadas.isEmpty()){
            return 0.0;
        }
        double suma = 0.0;
        for (double calificacion : asignaturasCursadas.values()) {
            suma += calificacion;
        }
        return suma/asignaturasCursadas.size();
    }
    
    public void mostrarRegistro() {
        System.out.println("\n    REGISTRO ACADEMICO  ");
        System.out.println("Alumno: " + alumno.getNombreCompleto());
        System.out.println("Edad: " + alumno.getEdad());
        System.out.println("Numero de Cuenta: " + alumno.getNumCuenta());
        System.out.println("Carrera: " + alumno.getCarrera());
        System.out.println("Semestre: " + alumno.getSemestre());
        
        System.out.println("\n    Asignaturas Cursadas   ");
        
        for (Map.Entry<Asignatura, Double> entry : asignaturasCursadas.entrySet()) {
            Asignatura asignatura = entry.getKey();
            double calificacion = entry.getValue();
            System.out.printf("- %s | Calificacion: %.1f%n", 
                asignatura.toString(), calificacion);
        }
        
        System.out.printf("%nTotal de creditos: %d%n", totalCreditos);
        System.out.printf("Promedio: %.2f%n", calcularPromedio());
        System.out.println("============================\n");
    }
}
