/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author alanv
 */
import java.util.Random;

public class Alumno {
    
    // El objeto Alumno tendrá de 1 a 2 nombres y 2 apellidos
    private String nombreCompleto;
    private String primerApellido;
    private String segundoApellido;

    private static final Random RANDOM = new Random();
    
    /**
     * Constructor que genera los datos según las reglas del negocio, 
     * incluyendo la coincidencia de género para dobles nombres.
     */
    public Alumno() {
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

    // Método para imprimir los datos del alumno (Encapsulamiento y legibilidad)
    public String obtenerNombreCompleto() {
        return this.nombreCompleto + " " + this.primerApellido + " " + this.segundoApellido;
    }
    
    // Opcional: Getter para acceder a la cadena completa
    public String getNombreCompleto() {
        return obtenerNombreCompleto();
    }
    
    // Para simplificar la salida y ver el resultado:
    @Override
    public String toString() {
        return "Alumno: " + obtenerNombreCompleto();
    }
}
