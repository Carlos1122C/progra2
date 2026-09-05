import edu.uatf.tp2.lab1.model.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Jose", "Espinoza", "jose.espinoza@example.com");
        Student s2 = new Student("Ana", "Garcia", "ana.garcia@example.com");

        System.out.println("Estudiante 1: " + s1.print());
        System.out.println("Estudiante 2: " + s2.print());
    }
}