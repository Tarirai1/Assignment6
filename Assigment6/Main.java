import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Patient {
    private int age;

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 130) {
            throw new InvalidAgeException("Invalid age: " +
                    "" + age + ". Age should be between 0 and 130.");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient patient = new Patient();

        System.out.println("Enter the age of the patient: ");
        int age = scanner.nextInt();

        try {
            patient.setAge(age);
            System.out.println("Patient age has been set successfully.");
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Grade assignment attempt for the patient has been completed.");
        }

        System.out.println("Enter the age of another patient: ");
        int anotherAge = scanner.nextInt();

        try {
            patient.setAge(anotherAge);
            System.out.println("Patient age has been set successfully.");
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Grade assignment attempt for the patient has been completed.");
        }
    }
}
