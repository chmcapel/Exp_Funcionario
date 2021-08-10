package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee joao;

        joao = new Employee();

        System.out.print("Name: ");
        joao.name = sc.nextLine();

        System.out.print("Gross salary: ");
        joao.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        joao.tax = sc.nextDouble();

        System.out.println("");

        System.out.printf("Employee: " + joao.name + ", $ %.2f%n", joao.NetSalary());
        System.out.println("");

        System.out.print("Which percentage to increase salary? ");
        joao.IncreaseSalary(sc.nextDouble());
        System.out.println("");

        System.out.printf("Updated data: "+ joao.name + ", $ %.2f", joao.NetSalary());

        sc.close();
    }
}
