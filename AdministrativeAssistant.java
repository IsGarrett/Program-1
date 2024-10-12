public class AdministrativeAssistant extends Employee implements Hourly {
    
    double hoursPerWeek;
    
    public AdministrativeAssistant(double empSalary, String empName, double hoursPerWeek){

        super(empSalary, hoursPerWeek, empName);

        this.empSalary = (empSalary / 26) / 80;
        this.empCash = empCash;
        this.empName = empName;
        this.hoursPerWeek = hoursPerWeek;

    }

    public double getHoursPerWeek(double hoursPerWeek) {

        return hoursPerWeek;

    }

    public void setHoursPerWeek(double hoursPerWeek){

        this.hoursPerWeek = hoursPerWeek;
    
    }
    
    public void giveRaise(double amount){

        empSalary += (empSalary + amount);

    }

    public double getPaid() {

        double getPaid = getHoursPerWeek(hoursPerWeek) * empSalary; 

        return getPaid;

    }

    public String toString() {

        return empName;
    }

    @Override
    public int getHoursWorked() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHoursWorked'");
    }

    @Override
    public void setHoursWorked(int hours) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setHoursWorked'");
    }














    
}