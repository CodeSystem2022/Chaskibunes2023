package paquete1;

import paquete2.Clase4;

public class TestDefault {
    public static void main(String[] args) {
        ClaseHija2 claseH2 = new ClaseHija2();
        claseH2.atributoDefault = "Cambio desde la prueba";
        System.out.println("claseH2 atributo default = " + claseH2.atributoDefault);

        //Se agrega una nuva clase con un nuevo atributo
        Clase4 clase4 = new Clase4("Publico");
        System.out.println(clase4.getAtributoPrivate());
        clase4.setAtributoPrivate("cambio");
        System.out.println("clase4 = "+clase4.getAtributoPrivate()); //Se imprime por pantalla
    }
}
