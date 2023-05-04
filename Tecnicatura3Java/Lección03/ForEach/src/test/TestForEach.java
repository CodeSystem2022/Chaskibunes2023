package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 7, 8}; //Sintaxis resumida
        for (int edad : edades) {
            System.out.println("edad= " + edad);
        }

        Persona personas[] = {new Persona("Juan"), new Persona("Carla"), new Persona("Beatriz")};

        for (Persona persona : personas) {
            System.out.println("Persona= " + persona);
        }
    }
}
