package Abtract;
public class Abstract {
	abstract class Employee {
	    protected String name;
	    protected double baseSalary;

	    public Employee(String name, double baseSalary) {
	        this.name = name;
	        this.baseSalary = baseSalary;
	    }

	    public abstract double calculateSalary();

	    public abstract void displayInfo();
	}

	class Manager extends Employee {
	    private double bonus;

	    public Manager(String name, double baseSalary, double bonus) {
	        super(name, baseSalary);
	        this.bonus = bonus;
	    }

	    @Override
	    public double calculateSalary() {
	        return baseSalary + bonus;
	    }

	    @Override
	    public void displayInfo() {
	        System.out.println("Manager Name: " + name);
	        System.out.println("Base Salary: " + baseSalary);
	        System.out.println("Bonus: " + bonus);
	        System.out.println("Total Salary: " + calculateSalary());
	    }
	}

	class Programmer extends Employee {
	    private int hoursWorked;
	    private double hourlyRate;

	    public Programmer(String name, double baseSalary, int hoursWorked, double hourlyRate) {
	        super(name, baseSalary);
	        this.hoursWorked = hoursWorked;
	        this.hourlyRate = hourlyRate;
	    }

	    @Override
	    public double calculateSalary() {
	        return baseSalary + (hoursWorked * hourlyRate);
	    }

	    @Override
	    public void displayInfo() {
	        System.out.println("Programmer Name: " + name);
	        System.out.println("Base Salary: " + baseSalary);
	        System.out.println("Hours Worked: " + hoursWorked);
	        System.out.println("Hourly Rate: " + hourlyRate);
	        System.out.println("Total Salary: " + calculateSalary());
	    }
	}

	public class Main {
	    private static Employee manager;
		private static Employee programmer;

		public static void main(String[] args) {
	        
	        manager = null;
			manager.displayInfo();

	        System.out.println();


	        programmer = null;
			programmer.displayInfo();
	    }
	}

}
