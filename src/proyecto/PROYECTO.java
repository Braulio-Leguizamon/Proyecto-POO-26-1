/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

/**
 *
 * @author alanv
 */
public class PROYECTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("--- Generacion de 10 Alumnos Aleatorios ---");
        
        // Creamos 10 objetos Alumno para probar
        for (int i = 0; i < 10; i++) {
            Alumno nuevoAlumno = new Alumno();
            System.out.println((i + 1) + ". " + nuevoAlumno.toString());
        }
        
        System.out.println("\n(Verifique que el 20% tenga dos nombres, los demas uno, y todos dos apellidos)");
    }
    
}
