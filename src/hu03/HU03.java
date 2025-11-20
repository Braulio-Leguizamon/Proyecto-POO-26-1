/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hu03;

/**
 *
 * @author tubba
 */
public class HU03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModuloRegistros modulo = new ModuloRegistros();
        
        System.out.println("MODULO DE REGISTROS ACADEMICOS");
        System.out.println("Total de asignaturas creadas: "+modulo.getAsignaturas().size());
        modulo.getAsignaturas();
        
        int i = 0;
        int numCuenta = 3000000;
        while(i <= 1000){
            Alumno alumno = new Alumno(numCuenta);
            modulo.agregarAlumno(alumno);
            i ++;
            numCuenta += 100;
        }
        
        System.out.println("\nGenerando Registros...");
        
        for (Alumno alumno : modulo.getAlumnos()) {
            modulo.generarRegistroAcademico(alumno);
        }
        
        System.out.println("Registros generados correctamente!");
    }
    
}
