package AbstractFactoryDesignPattern;

public class Main {

	public static void main(String[] args) {
	     Employee e1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
	     e1.employeeName();

	     Employee e2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
	     e2.employeeName();

	}

}
