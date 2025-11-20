/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu03;

/**
 *
 * @author Cliente
 */
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GeneradorDatos {
        // Instancia de Random para todas las selecciones aleatorias
    private static final Random RANDOM = new Random();

    // Estructuras de nombres separadas por género (al menos 50 en total)
    private static final List<String> NOMBRES_MASCULINOS = Arrays.asList(
        "Alejandro", "Javier", "Miguel", "Ricardo", "Andres", "Fernando", "Santiago", "Carlos", "Pablo", "Luis",
        "Jorge", "Manuel", "Angel", "Diego", "Hector", "Marco", "Juan", "Rafael", "Antonio", "Gustavo",
        "Roberto", "David", "Francisco", "Mario", "Jose", "Arturo", "Guillermo", "Alonso", "Benito", "Cesar",
        "Hector", "Julian", "Daniel", "Emilio", "Israel", "Jesus", "Pedro", "Alfredo", "Ernesto", "Felipe",
        "Ramon", "Victor", "Sergio", "Oscar", "Enrique", "Mauricio", "Gerardo", "Adolfo", "Ruben", "Ivan"
    ); // 50 Nombres masculinos

    private static final List<String> NOMBRES_FEMENINOS = Arrays.asList(
        "Sofia", "Valeria", "Isabella", "Camila", "Mariana", "Luciana", "Daniela", "Emma", "Regina", "Natalia",
        "Nicole", "Victoria", "Ximena", "Adriana", "Fernanda", "Andrea", "Gabriela", "Paulina", "Emilia", "Catalina",
        "Maria", "Claudia", "Elena", "Sara", "Veronica", "Diana", "Laura", "Julia", "Gloria", "Esther",
        "Ana", "Beatriz", "Carla", "Dulce", "Erika", "Irene", "Jimena", "Leticia", "Monica", "Nadia",
        "Olga", "Patricia", "Quetzali", "Rosa", "Tania", "Ursula", "Vanesa", "Yolanda", "Zoe", "Alma"
    ); // 50 Nombres femeninos

    // Estructura con 50 apellidos (Apellidos)
    private static final List<String> APELLIDOS = Arrays.asList(
        "Garcia", "Rodriguez", "Gonzalez", "Fernandez", "Lopez", "Martinez", "Sanchez", "Perez", "Gomez", "Diaz",
        "Vazquez", "Moreno", "Jimenez", "Ruiz", "Hernandez", "Torres", "Rivera", "Flores", "Ramirez", "Reyes",
        "Morales", "Ortiz", "Gutierrez", "Castillo", "Mendoza", "Contreras", "Vargas", "Silva", "Rojas", "Herrera",
        "Castro", "Blanco", "Navarro", "Soto", "Alonso", "Nunez", "Molina", "Aguilar", "Delgado", "Vega",
        "Cabrera", "Maldonado", "Cruz", "Estrada", "Guerrero", "Ramos", "Salazar", "Montes", "Miranda", "Padilla"
    );
    

    /**
     * Decide aleatoriamente un género base (MASCULINO o FEMENINO) y devuelve 
     * un nombre de esa lista.
     * @return Un array String[]: [0] = Nombre, [1] = Genero ("M" o "F").
     */
    public static String[] generarNombreConGeneroBase() {
        boolean esMasculino = RANDOM.nextBoolean(); // 50% de probabilidad

        if (esMasculino) {
            int indice = RANDOM.nextInt(NOMBRES_MASCULINOS.size());
            return new String[] {NOMBRES_MASCULINOS.get(indice), "M"};
        } else {
            int indice = RANDOM.nextInt(NOMBRES_FEMENINOS.size());
            return new String[] {NOMBRES_FEMENINOS.get(indice), "F"};
        }
    }

    /**
     * Obtiene un segundo nombre que coincide con el género proporcionado.
     * @param genero "M" para masculino, "F" para femenino.
     * @return Un segundo nombre del mismo género.
     */
    public static String generarSegundoNombre(String genero) {
        if ("M".equals(genero)) {
            int indice = RANDOM.nextInt(NOMBRES_MASCULINOS.size());
            return NOMBRES_MASCULINOS.get(indice);
        } else {
            int indice = RANDOM.nextInt(NOMBRES_FEMENINOS.size());
            return NOMBRES_FEMENINOS.get(indice);
        }
    }

    /**
     * Obtiene un apellido aleatorio de la lista.
     * @return Un apellido.
     */
    public static String generarApellido() {
        int indice = RANDOM.nextInt(APELLIDOS.size());
        return APELLIDOS.get(indice);
    }
}
