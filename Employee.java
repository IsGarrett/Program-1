import java.util.Scanner;

public abstract class Employee {
    
    protected double empSalary;
    protected double empCash;
    protected String empName;


    public Employee(double empSalary, double empCash, String empName) {

        this.empSalary = empSalary;
        this.empCash = empCash;
        this.empName = empName;

    }

    public String getName(){

        return empName;

    }

    public void getSalary(){

        double getSalary = empSalary;
    }

    public void getCash() {

        double getCash = empCash;
    }

    public double getPaid() {

        double getPaid = (empSalary / 26) + empCash; 

        return getPaid;

    }

    /*public String toString(){
        return empName;
    }*/

    public abstract void giveRaise(double raisePercent);




    

    
}
