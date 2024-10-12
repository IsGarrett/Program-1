public class SoftwareEngineer extends Employee { // Class declaration, extending the Employee class

    private String name; 

    // Constructor 
    public SoftwareEngineer(double empSalary, double empCash, String empName){
        super(empSalary, empCash, empName); // Call the superclass (Employee) constructor to initialize salary, cash, and name
    }

    //  give a raise to the employee
    public void giveRaise(double raisePercent){
        empSalary += (empSalary * raisePercent / 100); // Increase the employee's salary by the specified percentage
    }

    // calculate the employee's pay based on salary and cash
    public double getPaid() {
        double getPaid = (empSalary / 26) + empCash; // Calculate pay as a bi-weekly salary plus cash
        return getPaid; // Return the total pay
    }

    
    public String toString(){
        return empName + " Salary: " + empSalary + " Cash: " + getPaid() + " Software Engineer"; // Return a string with the employee's name, salary, cash, and job title
    }
}

    












