package ar.com.system2023.mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {

    Monitor monitorHP = new Monitor("HP", 13); //Importar la clase
    Teclado tecladoHP = new Teclado ("Bluetooth", "HP");
    Raton ratonHP = new Raton("bluetooth", "HP");
    Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

    // Creamos otros objetos diferente marca
    Monitor monitorGamer = new Monitor("Gamer", 32); //Importar la clase
    Teclado tecladoGamer = new Teclado ("Bluetooth", "Gamer");
    Raton ratonGamer = new Raton("bluetooth", "Gamer");
    Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

    Monitor monitorGamer2 = new Monitor("Gamer2", 42); //Importar la clase
    Teclado tecladoGamer2 = new Teclado ("Bluetooth", "Gamer");
    Raton ratonGamer2 = new Raton("bluetooth", "Gamer");
    Computadora computadoraGamer2 = new Computadora("Computadora Gamer2", monitorGamer2, tecladoGamer2, ratonGamer2);

    Orden orden1 = new Orden(); //Inicializamos el arreglo vacio
    Orden orden2 = new Orden();
    Orden orden3 = new Orden(); //una nueva lista para el objeto orden2
    orden1.agregarComputadora(computadoraHP);
    orden1.agregarComputadora(computadoraGamer);
    orden1.agregarComputadora(computadoraGamer2);

    
    Computadora computadorasVarias = new Computadora("computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
    orden2.agregarComputadora(computadorasVarias);

    orden1.mostrarOrden();
    orden2.mostrarOrden();
    orden3.mostrarOrden();
    }
}
