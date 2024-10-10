import java.util.Scanner;
 

public class Company {
    
    public static void mainMenu(){

        System.out.println("a. Add an Employee");
        System.out.println("b. List all Employees");
        System.out.println("c. Give an Employee a raise");
        System.out.println("d. Give Paychecks");
        System.out.println("e. Change someone’s hours");
        System.out.println("f. Quit");

    }


    public static void main(String[] args) {
       
       Scanner scnr = new Scanner(System.in); 
       String[] employeeArray = new String[5];
       String[] employeeObjects = new String [5];

       employeeArray[0] = "Joe";
       employeeArray[1] = "Bob";
       employeeArray[2] = "Louis";
       employeeArray[3] = "Brian";
       employeeArray[4] = "Jake";


        String userSelection;

        System.out.println("Select an option");

        mainMenu();

        userSelection = scnr.nextLine();

        

        if (userSelection.equals("a")) {

            System.out.println("Please enter employee name");
                String newEmployeeName = scnr.next();
                    for (int i= 0; i < employeeArray.length; i++){
                        if (employeeArray[i] == null) {
                            employeeArray[i] = newEmployeeName;
                                } else {
                                    System.out.println("Error: no space to add Employee");
                                        break;
                                    }
                                }
                            }

        if (userSelection.equals("b")) {
            for (int i= 0; i < employeeArray.length; i++){
                System.out.println(employeeArray[i]);
            }
        }
            
        if (userSelection.equals("c")) {

        }
        
        
        
        
        
        System.out.println(employeeArray[0]);
        System.out.println(employeeArray[2]);
                    


    }
}

        





   
