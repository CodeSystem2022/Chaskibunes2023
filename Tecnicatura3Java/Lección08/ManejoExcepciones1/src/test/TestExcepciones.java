
package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        
        //variables
        int resultado = 0;
        
        try{
            resultado = division(10, 0);
    //Las excepciones van en forma jerarquica---> de menor a mayor
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Ocurrió un ERROR");
            e.printStackTrace(System.out);    //Esto no es requerido pero segun el Id si--> pila de excepciones
            System.out.println(e.getMessage());
        }
        //Siemrpe se va a ejecutar con o sin excepciones
        finally{
            System.out.println("Se reviso la división entre cero");
        }
        
        System.out.println("La variable del resultado tiene como valor: "+resultado);
        
    }
}
