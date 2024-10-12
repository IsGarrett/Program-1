import java.util.Arrays;
import java.util.Scanner;
 

public class Company {
    
    public static void mainMenu(){

        System.out.println("Select an option");
        System.out.println("a. Add an Employee");
        System.out.println("b. List all Employees");
        System.out.println("c. Give an Employee a raise");
        System.out.println("d. Give Paychecks");
        System.out.println("e. Change someone’s hours");
        System.out.println("f. Quit");

    }

    static Employee[] x;


    public static void main(String[] args) {
       
       Scanner scnr = new Scanner(System.in); 
       Employee[] employeeArray = new Employee[5];
       Hourly[] employeeHourly = new Hourly [5];

       int employeeArrayCount = 0;
       int employeeHourlyCount = 0;


       AdministrativeAssistant Bob = new AdministrativeAssistant(500, "John", 40);

       
        String userSelection;

        

        mainMenu();

        userSelection = scnr.next();

       while (!userSelection.equalsIgnoreCase("f")) {
        
            
            if (userSelection.equalsIgnoreCase("a")) {
                    System.out.println("Please enter employee name:");
                    scnr.nextLine();
                    String empName = scnr.nextLine(); 
                    

                    System.out.println("What is their salary? (yearly or hourly):");
                    double empSalary = scnr.nextDouble();   

                    System.out.println("Are they an hourly worker? (Y/N):");
                        String hourlyYesNo = scnr.next(); 
                        if (hourlyYesNo.equalsIgnoreCase("Y")) {
                            System.out.println("How many hours per week do they work?");
                                double empHours = scnr.nextDouble();
                                
                                   AdministrativeAssistant temp = new AdministrativeAssistant(empSalary, empName, empHours);
                                   employeeArray[employeeArrayCount] = temp;
                                   employeeArrayCount++;
                                   employeeHourly[employeeHourlyCount] = temp;
                                   employeeHourlyCount++;

                                } 
                else { 
                    hourlyYesNo.equalsIgnoreCase("N"); {
                        double empCash=0;
                        SoftwareEngineer eng = new SoftwareEngineer(empSalary, empCash, empName);
                        employeeArray[employeeArrayCount] = eng;
                        employeeArrayCount++;
                        System.out.println(eng.getName() + " was hired");
                        }
                    }
                }
            
        if (userSelection.equalsIgnoreCase("b")) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(employeeHourly[i]);
            }
                         
                        

                        }
                        mainMenu();
                        userSelection = scnr.next();

                        }
                        
                        

                        
                

                 /*
             
                if (userSelection.equals("b")) {
                    for (int j = 0; j <employeeArray.length; i++){
                        System.out.println(employeeArray[i]);

                } 

                if (userSelection.equals("c")) {
                    System.out.println("Who do you want to give a raise to?");
                    String empRaise = scnr.next();
                    
                }*/
            }
        }
    

    


        





   
