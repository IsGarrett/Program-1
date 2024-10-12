public class AdministrativeAssistant extends Employee implements Hourly {
    
    int hoursPerWeek;
    
    public AdministrativeAssistant(double empSalary, String empName, int hoursPerWeek){

        super(empSalary, hoursPerWeek, empName);

        this.empSalary = (empSalary / 26) / 80;
        this.empCash = empCash;
        this.empName = empName;
        this.hoursPerWeek = hoursPerWeek;

    }

    public int getHoursWorked() {

        return hoursPerWeek;

    }

    public void setHoursWorked(int hoursPerWeek){

        this.hoursPerWeek = hoursPerWeek;
    
    }
    
    public void giveRaise(double amount){

        empSalary += (empSalary + amount);

    }

    public double getPaid() {

        double getPaid = hoursPerWeek * empSalary; 

        return getPaid;

    }

    public String getName() {

        return empName;
    }

    

    

    
    

    














    
}