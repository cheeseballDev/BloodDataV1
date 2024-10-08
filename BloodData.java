import java.util.Scanner;

public class BloodData {
    String bloodType;
    String rhFactor;
    static String[] validBloodTypes = {"A", "B", "O", "AB", ""};
    static String[] validRhFactors = {"-", "+"};

    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    public BloodData(String bt, String rh) {
        bloodType = bt;
        rhFactor = rh;
    }

    public void display() {
        System.out.print(bloodType + rhFactor + " is added to the blood bank.\n");
    }

    String checkBloodType(Scanner userInput) {
        while (true) {
            System.out.print("Enter blood type of patient: ");
            String userBloodType = userInput.nextLine().trim().toUpperCase();
            if (userBloodType.equals(""))
                return userBloodType;
            for (String bloodTypes: validBloodTypes) {
                if (userBloodType.equals(bloodTypes)) 
                    return userBloodType;
            }
            System.out.println("Invalid blood type! (Accepted values are A,B,O,AB)");
        }
    }

    String checkRhFactor(Scanner userInput) {
        while (true) {
            System.out.print("Enter the Rhesus factor (+ or -): ");
            String userRhFactor = userInput.nextLine().trim();
            if (userRhFactor.equals(""))
                return userRhFactor;
            for (String rhFactors: validRhFactors) {
                if (userRhFactor.equals(rhFactors)) 
                    return userRhFactor;
            }
            System.out.println("Invalid Rhesus factor! (Accepted values are: -,+)");
        }
    }
}