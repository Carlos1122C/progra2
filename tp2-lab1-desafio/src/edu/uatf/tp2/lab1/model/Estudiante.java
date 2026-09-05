package edu.uatf.tp2.lab1.model;

public class Estudiante {
    // Atributos del desafío
    private String nombre;
    private String carrera;
    private int semestre;
    private double promedio;

    // Constructor que inicializa todos los atributos
    public Estudiante(String nombre, String carrera, int semestre, double promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    // Método que imprime toda la información
    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Semestre: " + this.semestre);
        System.out.println("Promedio: " + this.promedio);
        System.out.println(); // Deja un espacio vacío entre estudiantes
    }
}
