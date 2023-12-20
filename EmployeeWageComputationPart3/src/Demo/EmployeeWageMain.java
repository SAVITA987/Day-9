package Demo;

public class EmployeeWageMain {

	    public static void main(String[] args) {
	        
	        Employee company1 = new Employee("Company1", 20, 8, 4, 20, 100);
	        Employee company2 = new Employee("Company2", 25, 9, 5, 22, 110);

	        boolean isPresent = company1.isEmployeePresent();
	        System.out.println("Employee is " + (isPresent ? "present" : "absent"));

	        int dailyWage = company1.calculateDailyWage();
	        System.out.println("Daily Wage for Company1: " + dailyWage);

	        company1.calculateMonthlyWage();

	        company2.calculateMonthlyWage();
	    }
	}


