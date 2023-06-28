package UTN.datos;

import static UTN.conexion.Conexion.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import UTN.dominio.Estudiante;

public class EstudianteDAO {
    // Métod Listar
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        // Creamos algunos objetos que son necesarios para comunicarnos con la base de
        // datos
        PreparedStatement ps; // Envia la sentencia a la base de datos
        ResultSet rs; // Obtenemos el resultado
        // Creamos un objeto de tipo conexíon
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                // Falta agregarlo a la lista
                estudiantes.add(estudiante);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error al seleccionar datos: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar la conexión: " + e.getMessage());
            }
        } // Fin Finally
        return estudiantes;
    }// FIn método listar

    // Método por id -> fin by id
    public boolean buscarEstudiantePorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes 2022 WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if(rs.next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true; //Se encontro un registro
        }   }//Fin if
            catch(Exception e){
                System.out.println("Ocurrio un error al buscar estudiante:"+e.getMessage());
            } //FIn catch
            finally{
                try{
                    con.close();
                }  catch(Exception e){
                System.out.println("Ocurrio un error al cerrar conexión:"+e.getMessage());
                }
            }//Fin finally
        return false;
    }

    //Método agregar un nuevo estudiante
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES (?,?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true;

        }catch(Exception e){
            System.out.println("Ocurrio un error al agregar el estudiante: "+e.getMessage());
        }//FIn catch
        finally{
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Ocurrio un error al cerrar la conexión: "+e.getMessage());
            }//Fin catch
        }//Fin finally
        return false;
    }//Fin método agregarEstudiante

    //Método para modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE estudiante2022 SET nombre=?, apellido=?, telefono=?, email=? WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        } catch(Exception e){
            System.out.println("Error al modificar estudiante: "+e.getMessage());
        }//FIn catch
        finally{
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Error al cerrar la conexión: "+e.getMessage());
            }//Fin catch
        }//Fin finally
        return false;
    } //Fin métedo modificarEstudiante

    public static void main(String[] args) {
        var EstudianteDAO = new EstudianteDAO();

        //Modificar estudiante
        var estudianteModificado = new Estudiante(1, "Juan Carlos", "Juarez", "5544663321", "juen@gmail.com");
        var modificado = EstudianteDAO.modificarEstudiante(estudianteModificado);
        if(modificado){
            System.out.println("Estudiante modificado: "+estudianteModificado);
        } else {
            System.out.println("No se modifico el estudiante: "+estudianteModificado);
        }

        //Agregar estudiantes
        //var nuevoEstudiante = new Estudiante("Carlos", "Lara", "5495544223", "carlosl@mail.com");
        //var agregado = EstudianteDAO.agregarEstudiante(nuevoEstudiante);
        //if(agregado){
            //System.out.println("Estudiante agregado: "+nuevoEstudiante);
        //} else{
            //System.out.println("No se ha agregado estudiante: "+nuevoEstudiante);
        //}

        // Listar los estudiantes
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = EstudianteDAO.listarEstudiantes();
        estudiantes.forEach(System.out::println);// Función lamba paar imprimir


        //Buscar por id
        //var estudiante1 = new Estudiante(1);
        //System.out.println("Estudiantes antes de la busqueda: "+estudiante1);
        //var encontrado = EstudianteDAO.buscarEstudiantePorId(estudiante1);
        //if(encontrado){
            //System.out.println("Estudiante encontrado: "+estudiante1);
        //} else{
            //System.out.println("No se encontro el estudiante: "+estudiante1.getIdEstudiante());
        //}

    }

}
