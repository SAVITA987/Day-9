package Demo;

import java.util.Random;

	class Employee {
	    private String companyName;
	    private int wagePerHour;
	    private int fullDayHours;
	    private int partTimeHours;
	    private int workingDaysPerMonth;
	    private int maxWorkingHours;
	    private int totalEmpWage;

	    // Constructor
	    public Employee(String companyName, int wagePerHour, int fullDayHours, int partTimeHours,
	                    int workingDaysPerMonth, int maxWorkingHours) {
	        this.companyName = companyName;
	        this.wagePerHour = wagePerHour;
	        this.fullDayHours = fullDayHours;
	        this.partTimeHours = partTimeHours;
	        this.workingDaysPerMonth = workingDaysPerMonth;
	        this.maxWorkingHours = maxWorkingHours;
	        this.totalEmpWage = 0;
	    }

	    // Method to check if employee is present or absent
	    public boolean isEmployeePresent() {
	        Random random = new Random();
	        return random.nextBoolean();
	    }

	    // Method to calculate daily employee wage
	    public int calculateDailyWage() {
	        int empHours = isEmployeePresent() ? fullDayHours : 0;
	        return empHours * wagePerHour;
	    }

	    // Method to calculate monthly employee wage
	    public void calculateMonthlyWage() {
	        int totalWorkingDays = 0;
	        int totalEmpHours = 0;

	        while (totalWorkingDays < workingDaysPerMonth && totalEmpHours < maxWorkingHours) {
	            totalEmpWage += calculateDailyWage();
	            totalEmpHours += isEmployeePresent() ? fullDayHours : 0;
	            totalWorkingDays++;
	        }

	        System.out.println("Total Employee Wage for " + companyName + " is: " + totalEmpWage);
	    }
	}

	