package UTN.presentacion;

import java.util.Scanner;

import UTN.conexion.Conexion;
import UTN.datos.EstudianteDAO;
import UTN.dominio.Estudiante;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SistemaEstudiantesApp {

    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in); // Para leer información de la consola
        // Se crea una instancia de la clase servicio, esto lo hacemos fuera del ciclo
        var EstudianteDAO = new EstudianteDAO();
        while(!salir){
            try{
                mostrarMenu(); //Mostramos el menú
                //Este será el método que devolverá un booleano
                salir = ejecutarOpciones(consola, EstudianteDAO); //Este arroja una exception
            } catch(Exception e){ //Fin del try
                System.out.println("Ocurrio un error al ejecutar la operación: "+e.getMessage());
            } //Fin del catch
        } // Fin while
        var conexion = Conexion.getConnection();
        if(conexion != null)
            System.out.println("Conexión exitosa: "+conexion);
        else
            System.out.println("Error al conectarse");
    }//Fin main

    private static void mostrarMenu(){
        System.out.print("""
                ******* Sistema de Estudiantes *******
                1. Listar Estudiante
                2. Buscar Estudiantes
                3. Agregar Estudiante
                4. Modificar Estudiante
                5. Eliminar Estudiante
                6. Salir
                """);
    }
// Método para ejecutar las opciones, va a regresar un valor booleano, ya que es el que
    // Puede modificar el valor de la variable salir, si es verdadero termina el ciclo While
    private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDAO){
        var opcion = Integer.parseInt(consola.nextLine()); 
        var salir = false;
        switch(opcion){
            case 1 -> { //Listar estudiantes
                System.out.println("Listado de Estudiantes...");
                //no muestra la información, solo recupera la info y regresa una lista
                var estudiantes = estudianteDAO.listarEstudiantes(); //recibe el listado
                //Vamos a iterar cada objeto de tipo estudiante
                estudiantes.forEach(System.out::println);
            }//Fin caso 1
            case 2 -> { //Buscar estudiante por id
                System.out.println("Introduce el id_estudiante a buscar: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante);
                if(encontrado){
                    System.out.println("Estudiante encontrado: "+estudiante);
                } else{
                    System.out.println("Estudiante NO encontrado: "+estudiante);
                }
            } //Fin caso 2
            case 3 -> { //Agregar estudiante
                System.out.println("Agregar estudiante: ");
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                // Crear objeto estudiante
                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var agregado = estudianteDAO.agregarEstudiante(estudiante);
                if (agregado) {
                    System.out.println("Estudiante agregado: "+estudiante);
                } else{
                    System.out.println("Estudiante NO agregado: "+estudiante);
                }
            }//Fin caso 3
            case 4 -> { //Modificar estudiante
                System.out.println("Modificar estudiante: ");
                //Aquí lo primero es especificar cual es el id del objeto a modificar
                System.out.println("Id estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //Crea el objeto estudiante a modificar
                var estudiante = new Estudiante(idEstudiante, nombre, apellido, telefono, email);
                var modificado = estudianteDAO.modificarEstudiante(estudiante);
                if (modificado) {
                    System.out.println("Estudiante modificado: "+estudiante);
                } else{
                    System.out.println("Estudiante NO modificado: "+estudiante);
                }
            }//Fin caso 4
            case 5 -> { //Eliminar estudiante
                System.out.println("Eliminar estudiante: ");
                System.out.println("Id Estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDAO.eliminarEstudiante(estudiante);
                if (eliminado) {
                    System.out.println("Estudiante eliminado: "+estudiante);
                } else {
                    System.out.println("Estudiante NO eliminado: "+estudiante);
                }
            } //Fin caso 5 
            case 6 -> { //Salir
                System.out.println("Hasta pronto!!!");
                salir = true;
            }//Fin caso 6
            default -> System.out.println("Opción no reconocida, ingrese otra opción");
        } //Fin switch
        return salir;
    }
}//Fin clase