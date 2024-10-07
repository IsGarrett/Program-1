public class SoftwareEngineer extends Employee {
    
    
    private String name;

    public SoftwareEngineer(double empSalary, double empCash, String empName){

        super(empSalary, empCash, empName);

        empCash = 0; 
    }

    public double giveRaise(double raisePercent){

        double newSalary = (empSalary / 26) * raisePercent;

        return newSalary;

    }

    public interface Hourly {
    
        
    }









}
