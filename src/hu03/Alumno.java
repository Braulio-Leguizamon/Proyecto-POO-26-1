/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu03;

import java.util.Random;

/**
 *
 * @author tubba
 */
public class Alumno {
    private int numCuenta;
    private int semestre;
    private int edad;
    private String nombreCompleto;
    private String primerApellido;
    private String segundoApellido;

    private static final Random RANDOM = new Random();
    private RegistroAcademico registroAcademico;
    private static final String CARRERA = "Ingenieria en Computacion";

    public Alumno(int numCuenta) {
        
        this.numCuenta = numCuenta;
        this.semestre = RANDOM.nextInt(11) + 1;
        this.edad = generarEdad();
        // 1. Generamos el nombre base y obtenemos el género asociado
        String[] nombreBaseData = GeneradorDatos.generarNombreConGeneroBase();
        String nombre1 = nombreBaseData[0];
        String genero = nombreBaseData[1];

        // 2. Aplicamos la regla del 20% para dos nombres
        boolean tieneDosNombres = RANDOM.nextInt(10) < 2; // 20%

        if (tieneDosNombres) {
            // Si tiene dos nombres, forzamos la coincidencia de género.
            // Ahora es imposible tener "Valeria Pablo" (F + M)
            String nombre2 = GeneradorDatos.generarSegundoNombre(genero);
            this.nombreCompleto = nombre1 + " " + nombre2;
        } else {
            // 80% solo tiene un nombre
            this.nombreCompleto = nombre1;
        }

        // 3. Regla: Todos los alumnos tendrán 2 apellidos
        this.primerApellido = GeneradorDatos.generarApellido();
        this.segundoApellido = GeneradorDatos.generarApellido();
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    // Método para imprimir los datos del alumno (Encapsulamiento y legibilidad)
    public String obtenerNombreCompleto() {
        return this.nombreCompleto + " " + this.primerApellido + " " + this.segundoApellido;
    }
    
    // Opcional: Getter para acceder a la cadena completa
    public String getNombreCompleto() {
        return obtenerNombreCompleto();
    }

    public RegistroAcademico getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(RegistroAcademico registroAcademico) {
        this.registroAcademico = registroAcademico;
    }
    
    public String getCarrera() { 
        return CARRERA; 
    }
    
    public int generarEdad(){
        int sem = getSemestre();
        int e;
        if(sem <=2 ){
            e = RANDOM.nextInt(10)+18;
        }
        else if(sem == 3 || sem == 4 ){
            e = RANDOM.nextInt(10)+19;
        }
        else if(sem == 5 || sem == 6 ){
            e = RANDOM.nextInt(10)+20;
        }
        else if(sem == 7 || sem == 8 ){
            e = RANDOM.nextInt(10)+21;
        }
        else if(sem == 9 || sem == 10 ){
            e = RANDOM.nextInt(10)+22;
        }
        else{
            e = 0;
        }
        return e;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getSemestre(){
        return semestre;
            }
    
    @Override
    public String toString() {
        return "Alumno: " + nombreCompleto + " - " + numCuenta + " - " + CARRERA;
    }
 
}
