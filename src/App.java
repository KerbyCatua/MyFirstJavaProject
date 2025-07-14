import java.util.*;

public class App {

    public static void main(String[] args) {
        Student student = new Student("Alexis Mendoza", 18);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: " + student.name());
        System.out.println("Age: " + student.age());


        System.out.print("Enter Coffee size (SMALL/MEDIUM/LARGE) : ");
        String userInput = scanner.nextLine().toUpperCase(); 

        try {
            Size size = Size.valueOf(userInput);

            switch (size) {
                case SMALL -> {
                    System.out.println("You choosed: " + size.getSize());
                }case MEDIUM -> {
                    System.out.println("You choosed: " + size.getSize());
                }case LARGE -> {
                    System.out.println("You choosed: " + size.getSize());
                }
            }
        } catch (Exception e) {
            System.out.println("No available size named: " + userInput.toLowerCase());
        }

        System.out.println();

        scanner.close();
    }
}