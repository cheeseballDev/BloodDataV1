import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        BloodData bloodDataObjectInitial = new BloodData();
        Scanner userInput = new Scanner(System.in);
        clearScreen();
        while(true) {
            String userBloodTypeFinal = bloodDataObjectInitial.checkBloodType(userInput);
            String userRhFactorFinal = bloodDataObjectInitial.checkRhFactor(userInput);
            if(!userBloodTypeFinal.isEmpty() && userRhFactorFinal.isEmpty()) {
                System.out.println("Only blood type is added! Please try again!");
                continue;
            }
            if(userBloodTypeFinal.isEmpty() && !userRhFactorFinal.isEmpty()) {
                System.out.println("Only user Rhesus factor is added! Please try again!");
                continue;
            }
            if(!(userBloodTypeFinal.isEmpty() && userRhFactorFinal.isEmpty())) {
                BloodData bloodDataObject = new BloodData(userBloodTypeFinal, userRhFactorFinal);
                bloodDataObject.display();
            
                continue;
            }
            bloodDataObjectInitial.display();
        }
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }  
}