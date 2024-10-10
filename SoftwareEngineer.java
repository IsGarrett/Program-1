public class SoftwareEngineer extends Employee {
    
    
    private String name;

    public SoftwareEngineer(double empSalary, double empCash, String empName){

        super(empSalary, empCash, empName);

        empCash = 0; 
    }

    public void giveRaise(double raisePercent){

        empSalary += (empSalary * raisePercent / 100);

    }

    











}
