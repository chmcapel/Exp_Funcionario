package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        percentage *= grossSalary / 100;
        grossSalary += percentage;
    }

}