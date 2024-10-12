/* CSC 205: <Class 26063> / <Online>
Program: <Program 1>
Author(s): <Garrett Lambert> & <gar2161746>

Description: The purpose of this code is to managing employee records in a company setting by prompting the user
for input and asking follow up questions based off of the logic. It has certain method functionality built in. 
*/



import java.util.Arrays;
import java.util.Scanner;
 

public class Company {

    // Method to display the main menu options to the user
    public static void mainMenu(){
        System.out.println("Select an option");
        System.out.println("a. Add an Employee");
        System.out.println("b. List all Employees");
        System.out.println("c. Give an Employee a raise");
        System.out.println("d. Give Paychecks");
        System.out.println("e. Change someone’s hours");
        System.out.println("f. Quit");
    }

    static Employee[] x; // Static array of Employee objects (not used in the current code)

    public static void main(String[] args) {
       
       Scanner scnr = new Scanner(System.in); // Create a Scanner object for user input
       Employee[] employeeArray = new Employee[5]; // Array to store up to 5 Employee objects
       Hourly[] employeeHourly = new Hourly[5]; // Array to store up to 5 Hourly employees

       int employeeArrayCount = 0; // Counter for the number of employees in employeeArray
       int employeeHourlyCount = 0; // Counter for the number of hourly employees in employeeHourly

       String userSelection; // Variable to hold user selection from the menu

       mainMenu(); // Display the main menu to the user
       userSelection = scnr.next(); // Read the user's selection

       // Loop until the user selects 'f' to quit
       while (!userSelection.equalsIgnoreCase("f")) {
            
            // Option to add a new employee
            if (userSelection.equalsIgnoreCase("a")) {
                System.out.println("Please enter employee name:");
                scnr.nextLine(); // Clear the buffer
                String empName = scnr.nextLine(); // Read the employee's name

                System.out.println("What is their salary? (yearly or hourly):");
                double empSalary = scnr.nextDouble(); // Read the employee's salary

                System.out.println("Are they an hourly worker? (Y/N):");
                String hourlyYesNo = scnr.next(); // Check if the employee is hourly
                if (hourlyYesNo.equalsIgnoreCase("Y")) { // If they are hourly
                    System.out.println("How many hours per week do they work?");
                    int empHours = scnr.nextInt(); // Read the hours they work per week

                    // Create an AdministrativeAssistant object and add it to the employee arrays
                    AdministrativeAssistant temp = new AdministrativeAssistant(empSalary, empName, empHours);
                    employeeArray[employeeArrayCount] = temp; // Add to employeeArray
                    employeeArrayCount++; // Increment the employee count
                    employeeHourly[employeeHourlyCount] = temp; // Add to employeeHourly
                    employeeHourlyCount++; // Increment the hourly employee count

                } else { // If they are not hourly
                    hourlyYesNo.equalsIgnoreCase("N"); // This line is unnecessary
                    double empCash = 0; // Set initial cash to 0
                    SoftwareEngineer eng = new SoftwareEngineer(empSalary, empCash, empName); // Create a SoftwareEngineer object
                    employeeArray[employeeArrayCount] = eng; // Add to employeeArray
                    employeeArrayCount++; // Increment the employee count
                    System.out.println(eng.getName() + " was hired!"); // Confirm hiring
                }
            }
            
            // Option to list all employees
            if (userSelection.equalsIgnoreCase("b")) {
                boolean hasEmployees = false; // Flag to check if there are employees

                // Iterate over the employee array
                for (int i = 0; i < 5; i++) {
                    if (employeeArray[i] != null) { // If the employee exists
                        System.out.println(employeeArray[i]); // Print employee details
                        hasEmployees = true; // At least one employee exists
                    }
                }
                
                // If no employees were found, print "Nobody works here!"
                if (!hasEmployees) {
                    System.out.println("Nobody works here!");
                }
            }

            // Option to give an employee a raise
            if (userSelection.equalsIgnoreCase("c")) {
                System.out.println("Who do you want to give a raise to?");
                scnr.nextLine(); // Clear the buffer
                String raiseSelection = scnr.nextLine(); // Read the employee's name for the raise
                System.out.println("What raise do you want to give them?");
                double raisePercent = scnr.nextDouble(); // Read the raise percentage
                Employee foundEmployee = null; // Variable to hold the found employee

                // Iterate through the employee array to find the specified employee
                for (Employee emp : employeeArray) {
                    if (emp != null) { // Check if the employee exists
                        if (emp.getName().equals(raiseSelection)) { // If the names match
                            foundEmployee = emp; // Store the found employee
                            emp.giveRaise(raisePercent); // Give the employee a raise
                            System.out.println(emp.getName() + " is happy!"); // Confirm the raise
                            break; // Exit the loop
                        }
                    }
                }
            }

            // Option to give paychecks
            if (userSelection.equalsIgnoreCase("d")) {
                for (int i = 0; i < employeeArrayCount; i++) {
                    employeeArray[i].getPaid(); // Call getPaid() for each employee
                }
                System.out.println("Hooray for money!"); // Confirm paychecks have been given
            }

            // Option to change an employee's hours
            if (userSelection.equalsIgnoreCase("e")) {
                System.out.println("Which employee's hours would you like to change?");
                scnr.nextLine(); // Clear the buffer
                String empToChange = scnr.nextLine(); // Read the employee's name
                Hourly foundEmployee = null; // Variable to hold the found hourly employee

                // Iterate through the employeeHourly array to find the specified hourly employee
                for (Hourly emp : employeeHourly) {
                    if (emp != null) { // Check if the employee exists
                        if (emp.getName().equals(empToChange)) { // If the names match
                            foundEmployee = emp; // Store the found employee
                            System.out.println(emp.getName() + " currently works " + emp.getHoursWorked() + " per week. What would you like to change it to?");
                            int newHoursWorked = scnr.nextInt(); // Read the new hours worked
                            emp.setHoursWorked(newHoursWorked); // Set the new hours
                            System.out.println(emp.getName() + " will now work " + emp.getHoursWorked() + " hours per week."); // Confirm the change
                            break; // Exit the loop
                        }
                    }
                }
            }

            // Exit option (this part is unnecessary since the loop is controlled by userSelection)
            if (userSelection.equalsIgnoreCase("f")) {
                // This block is empty, but could be used for any clean-up before quitting
            }

            mainMenu(); // Display the menu again
            userSelection = scnr.next(); // Read the user's selection again
        }
        
        System.out.println("Bye!"); // Print a goodbye message when exiting the loop
    }
}
        
        

    

    


        





   
