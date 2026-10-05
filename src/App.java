import grades.GradeManager;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        GradeManager gradeManager = new GradeManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\\nMenu");
            System.out.println("1.Add grade");
            System.out.println("2.View average grade");
            System.out.println("3.View number of passing grades");
            System.out.println("4.Remove a grade");
            System.out.println("5.Exit");
            System.out.println("Choose an option: ");
            Integer choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a grade: ");
                    Double grade = scanner.nextDouble();
                    gradeManager.addGrade(grade);
                    break;
                case 2:
                    System.out.println("Average grade: " + gradeManager.calculateAvarage());
                    break;
                case 3:
                    System.out.println("Number of passing grades: " + gradeManager.countPassingGrades());
                    break;
                case 4:
                    System.out.println("\nHow do you want to remove the grade?");
                    System.out.println("1.By Position (Index)");
                    System.out.println("2.By Value");
                    System.out.println("Choose an option: ");
                    int removeChoice = scanner.nextInt();
                    
                    if (removeChoice == 1) {
                        System.out.println("Enter the position (0 to N-1): ");
                        int index = scanner.nextInt();
                        if (gradeManager.removeGradeByIndex(index)) {
                            System.out.println("Grade at position " + index + " was removed successfully.");    
                        }
                        else {
                            System.out.println("Error: Invalid position. No grade was removed.");
                        }
                    }
                    else if (removeChoice == 2) {
                        System.out.println("Enter the exact grade value to remove: ");
                        Double value = scanner.nextDouble();
                        if (gradeManager.removeGradeByValue(value)) {
                            System.out.println("Grade" + value + "was removed successfully.");
                        }
                        else {
                            System.out.println("Error: Grade value not found in this list.");
                        }
                    }
                    else {
                        System.out.println("Invalid removed option.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");                
            }
        }
    }
}
