
package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
    //metodo con posible excepcion usando el "THROWS"
    public static int division(int numerador, int denominador) throws OperacionExcepcion{
        if (denominador == 0){
            //nuevo objeto para manejar la excepcion
            throw new OperacionExcepcion("Division entre cero");
        }
        return numerador/denominador;
    }
    
}
