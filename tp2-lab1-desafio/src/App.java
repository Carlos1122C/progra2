import edu.uatf.tp2.lab1.model.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        // 1. Creamos los 4 objetos con datos diferentes
        Estudiante e1 = new Estudiante("Carlos Mendoza", "Ingeniería de Sistemas", 5, 82.5);
        Estudiante e2 = new Estudiante("Ana García", "Ingeniería Civil", 3, 90.0);
        Estudiante e3 = new Estudiante("José Espinoza", "Arquitectura", 6, 78.4);
        Estudiante e4 = new Estudiante("María López", "Medicina", 2, 85.1);

        // 2. Imprimimos el formato y llamamos a mostrarDatos() para cada uno
        System.out.println("--- ESTUDIANTE 1 ---");
        e1.mostrarDatos();

        System.out.println("--- ESTUDIANTE 2 ---");
        e2.mostrarDatos();

        System.out.println("--- ESTUDIANTE 3 ---");
        e3.mostrarDatos();

        System.out.println("--- ESTUDIANTE 4 ---");
        e4.mostrarDatos();
    }
}
