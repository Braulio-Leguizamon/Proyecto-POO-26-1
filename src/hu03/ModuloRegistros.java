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
public class ModuloRegistros {
    private List<List<Asignatura>> asignaturas;
    private List<Asignatura> semestre1;
    private List<Asignatura> semestre2;
    private List<Asignatura> semestre3;
    private List<Asignatura> semestre4;
    private List<Asignatura> semestre5;
    private List<Asignatura> semestre6;
    private List<Asignatura> semestre7;
    private List<Asignatura> semestre8;
    private List<Asignatura> semestre9;
    private List<Asignatura> semestre10;
    private List<Alumno> alumnos;

    public ModuloRegistros() {
        this.asignaturas = new ArrayList<>();
        this.semestre1 = new ArrayList<>();
        this.semestre2 = new ArrayList<>();
        this.semestre3 = new ArrayList<>();
        this.semestre4 = new ArrayList<>();
        this.semestre5 = new ArrayList<>();
        this.semestre6 = new ArrayList<>();
        this.semestre7 = new ArrayList<>();
        this.semestre8 = new ArrayList<>();
        this.semestre9 = new ArrayList<>();
        this.semestre10 = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        inicializarAsignaturas();
    }

    public List<List<Asignatura>> getAsignaturas() {
        return asignaturas;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
    
    
    
    private void inicializarAsignaturas(){
         // Semestre 1
        agregarAsignatura("Calculo Diferencial", 5, 1);
        agregarAsignatura("Algebra Lineal", 5, 2);
        agregarAsignatura("Fundamentos de Programacion", 6, 3);
        agregarAsignatura("Introduccion a la Ingenieria en Computacion", 4, 4);
        agregarAsignatura("Fundamentos de Electronica", 6, 5);
        
        // Semestre 2
        agregarAsignatura("Calculo Integral", 5, 6);
        agregarAsignatura("Programacion Orientada a Objetos", 6, 7);
        agregarAsignatura("Circuitos Electricos", 6, 8);
        agregarAsignatura("Matematicas Discretas", 4, 9);
        agregarAsignatura("Arquitectura de Computadoras I", 5, 10);
        
        // Semestre 3
        agregarAsignatura("Calculo Multivariable", 5, 11);
        agregarAsignatura("Estructuras de Datos", 6, 12);
        agregarAsignatura("Probabilidad y Estadistica", 4, 13);
        agregarAsignatura("Arquitectura de Computadoras II", 5, 14);
        agregarAsignatura("Electronica Digital", 6, 15);
        
        // Semestre 4
        agregarAsignatura("Sistemas Operativos", 6, 16);
        agregarAsignatura("Metodos Numericos", 5, 17);
        agregarAsignatura("Teoria de la Computacion", 4, 18);
        agregarAsignatura("Seniales y Sistemas", 5, 19);
        agregarAsignatura("Programacion de Sistemas", 6, 20);
        
        // Semestre 5
        agregarAsignatura("Bases de Datos I", 6, 21);
        agregarAsignatura("Redes de Computadoras I", 6, 22);
        agregarAsignatura("Microcontroladores", 6, 23);
        agregarAsignatura("Programacion Web", 5, 24);
        agregarAsignatura("Ingenieria de Software I", 4, 25);
        
        // Semestre 6
        agregarAsignatura("Bases de Datos II", 5, 26);
        agregarAsignatura("Redes de Computadoras II", 6, 27);
        agregarAsignatura("Compiladores", 6, 28);
        agregarAsignatura("Sistemas Embebidos", 6, 29);
        agregarAsignatura("Ingenieria de Software II", 4, 30);
        
        // Semestre 7
        agregarAsignatura("Sistemas Distribuidos", 6, 31);
        agregarAsignatura("Seguridad Informatica", 5, 32);
        agregarAsignatura("Modelado y Simulacion", 5, 33);
        agregarAsignatura("Interfaces Hombre-Maquina", 5, 34);
        agregarAsignatura("Inteligencia Artificial", 5, 35);
        
        // Semestre 8
        agregarAsignatura("Internet de las Cosas", 6, 36);
        agregarAsignatura("Vision por Computadora", 6, 37);
        agregarAsignatura("Computacion en la Nube", 6, 38);
        agregarAsignatura("Redes Inalambricas Avanzadas", 5, 39);
        agregarAsignatura("Gerencia de Proyectos Tecnologicos", 4, 40);
        
        // Semestre 9
        agregarAsignatura("Aprendizaje Automatico", 6, 41);
        agregarAsignatura("Ciberseguridad Avanzada", 6, 42);
        agregarAsignatura("Robotica", 6, 43);
        agregarAsignatura("Alta Disponibilidad y Tolerancia a Fallos", 5, 44);
        agregarAsignatura("Gestion de Infraestructura TI", 4, 45);
        
        // Semestre 10
        agregarAsignatura("Realidad Virtual y Aumentada", 6, 46);
        agregarAsignatura("Introduccion a la Computación Cuántica", 4, 47);
        agregarAsignatura("Proyecto Terminal I", 10, 48);
        agregarAsignatura("Ética Profesional y Responsabilidad Tecnologica", 3, 49);
        agregarAsignatura("Emprendimiento Tecnologico", 4, 50);
    }
    
    private void agregarAsignatura(String nombre, int creditos, int id){
        asignaturas.add(semestre1);
        asignaturas.add(semestre2);
        asignaturas.add(semestre3);
        asignaturas.add(semestre4);
        asignaturas.add(semestre5);
        asignaturas.add(semestre6);
        asignaturas.add(semestre7);
        asignaturas.add(semestre8);
        asignaturas.add(semestre9);
        asignaturas.add(semestre10);
        if(id<=5){
            asignaturas.get(0).add(new Asignatura(id, nombre, creditos));
        }
        if(id<=10 && id >5){
            asignaturas.get(1).add(new Asignatura(id, nombre, creditos));
        }
        if(id<=15 && id >10){
            asignaturas.get(2).add(new Asignatura(id, nombre, creditos));
        }
        if(id<=20 && id >15){
            asignaturas.get(3).add(new Asignatura(id, nombre, creditos));
        }
        if(id<=25 && id >20){
            asignaturas.get(4).add(new Asignatura(id, nombre, creditos));
        }
        if(id<=30 && id >25){
            asignaturas.get(5).add(new Asignatura(id, nombre, creditos));
        }
        if(id<=35 && id >30){
            asignaturas.get(6).add(new Asignatura(id, nombre, creditos));
        }
        if(id<=40 && id >35){
            asignaturas.get(7).add(new Asignatura(id, nombre, creditos));
        }
        if(id<=45 && id >40){
            asignaturas.get(8).add(new Asignatura(id, nombre, creditos));
        }
        if(id<=50 && id >45){
            asignaturas.get(9).add(new Asignatura(id, nombre, creditos));
        }
       
    }
    
    public void generarRegistroAcademico(Alumno alumno){
        RegistroAcademico registro = new RegistroAcademico(alumno);
        
        List<Asignatura> asignaturaCursadas = new ArrayList<>();
        
        int semestre = alumno.getSemestre();
        for(int i = 0;i<asignaturas.size(); i++){
            if(i<semestre){
                for(Asignatura a : asignaturas.get(i)){
                    asignaturaCursadas.add(a); 
                }
            }
        }
        for (Asignatura asignatura: asignaturaCursadas) {
            double calificacion = generarCalificacion();
            registro.agregarAsignatura(asignatura, calificacion);
        }
        
        alumno.setRegistroAcademico(registro);
        System.out.println("Registro Academico generado para: "+alumno.getNombreCompleto());
        registro.mostrarRegistro();
    }
    
    
    private double generarCalificacion(){
        Random random = new Random();
        return 5.0 + (random.nextDouble()*4.0);
    }
    
    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    
    public void mostrarAsignaturas(){
        System.out.println("Asignaturas Disponibles");
        for(int i = 0;i<asignaturas.size(); i++){
            for(Asignatura asignatura : asignaturas.get(i)){
                System.out.printf("%s (%d creditos)%n",asignatura.getNombre(), asignatura.getCreditos());

            }
        }
   
        System.out.println("Total: "+asignaturas.size() + " asignaturas");
    }
    
}
