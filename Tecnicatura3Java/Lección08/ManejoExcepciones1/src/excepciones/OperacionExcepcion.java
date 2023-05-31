
package excepciones;

public class OperacionExcepcion extends Exception{
    //Mensaje que normalemnte se envia al padre
    //Costructor
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
